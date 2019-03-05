package info.developia.codebattler.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class Creature extends AbstractCreation  {

    private Date born;
    private Date die;

}
