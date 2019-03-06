package info.developia.codebattler.backend.controller;

import info.developia.codebattler.backend.model.AbstractCreation;
import info.developia.codebattler.backend.model.Creature;
import info.developia.codebattler.backend.service.CreationService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

public class CreationControllerTest {

    @Mock
    CreationService creationService;
    @InjectMocks
    CreationController creationController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateFromCode() {
        when(creationService.createFromCode(anyString())).thenReturn(new Creature());

        ResponseEntity<AbstractCreation> result = creationController.createFromCode("code");

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertNotNull(result.getBody());
    }

    @Test
    public void testGenerate() {
        when(creationService.createFromCode(anyString())).thenReturn(new Creature());

        ResponseEntity<AbstractCreation> result = creationController.generate();

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertNotNull(result.getBody());
    }

}
