package info.developia.codebattler.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends AbstractCreation {

    private int uses;

}
