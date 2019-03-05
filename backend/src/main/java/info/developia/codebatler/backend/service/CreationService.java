package info.developia.codebatler.backend.service;

import info.developia.codebatler.backend.model.AbstractCreation;

public interface CreationService {

    AbstractCreation createFromCode(String code);

}
