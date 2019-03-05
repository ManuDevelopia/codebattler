package info.developia.codebatler.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends AbstractCreation {

    private int uses;

}
