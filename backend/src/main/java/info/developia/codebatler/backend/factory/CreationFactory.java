package info.developia.codebatler.backend.factory;

import info.developia.codebatler.backend.exception.CodeException;
import info.developia.codebatler.backend.model.*;
import org.springframework.stereotype.Component;

@Component
public class CreationFactory {

    public AbstractCreation createFromCode(String code) {
        Type type = getTypeFromCode(code);

        switch (type) {
            case ITEM:
                return new Item();
            case CREATURE:
                return new Creature();
            default:
                throw new CodeException("No valid code");
        }
    }

    private Type getTypeFromCode(String code) {

        if (code.matches(".*[a-z]$")) {
            return Type.ITEM;
        } else {
            return Type.CREATURE;
        }
    }

    private enum Type {ITEM, CREATURE}

}
