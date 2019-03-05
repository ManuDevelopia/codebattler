package info.developia.codebatler.backend.controller;

import info.developia.codebatler.backend.model.AbstractCreation;
import info.developia.codebatler.backend.service.CreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/creation")
public class CreationController {

    private final CreationService creationService;

    @Autowired
    public CreationController(CreationService creationService) {
        this.creationService = creationService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<AbstractCreation> createFromCode(@PathVariable String code) {

        AbstractCreation creation = creationService.createFromCode(code);

        return ResponseEntity.ok(creation);
    }

    @GetMapping("/generate")
    public ResponseEntity<AbstractCreation> generate() {
        return createFromCode(UUID.randomUUID().toString());
    }

}
