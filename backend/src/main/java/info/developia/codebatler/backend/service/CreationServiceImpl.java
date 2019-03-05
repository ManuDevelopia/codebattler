package info.developia.codebatler.backend.service;

import info.developia.codebatler.backend.factory.CreationFactory;
import info.developia.codebatler.backend.model.AbstractCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreationServiceImpl implements CreationService {

    private final CreationFactory creationFactory;

    @Autowired
    public CreationServiceImpl(CreationFactory creationFactory) {
        this.creationFactory = creationFactory;
    }

    @Override
    public AbstractCreation createFromCode(String code) {
        return creationFactory.createFromCode(code);
    }

}
