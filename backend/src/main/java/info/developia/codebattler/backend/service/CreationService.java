package info.developia.codebattler.backend.service;

import info.developia.codebattler.backend.model.AbstractCreation;

public interface CreationService {

    AbstractCreation createFromCode(String code);

}
