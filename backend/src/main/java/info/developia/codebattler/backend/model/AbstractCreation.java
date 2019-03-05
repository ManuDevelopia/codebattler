package info.developia.codebattler.backend.model;

import lombok.Data;

import java.util.Date;

@Data
public abstract class AbstractCreation {

    private String id;
    private String name;
    private Date created = new Date();

}
