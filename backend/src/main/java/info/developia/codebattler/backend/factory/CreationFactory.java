package info.developia.codebattler.backend.factory;

import info.developia.codebattler.backend.exception.CodeException;
import info.developia.codebattler.backend.model.*;
import info.developia.codebattler.backend.model.AbstractCreation;
import info.developia.codebattler.backend.model.Creature;
import info.developia.codebattler.backend.model.Item;
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
