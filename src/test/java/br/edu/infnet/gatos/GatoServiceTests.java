package br.edu.infnet.gatos;


import br.edu.infnet.gatos.model.Gato;
import br.edu.infnet.gatos.service.GatoService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class GatoServiceTests {

    Logger logger = LoggerFactory.getLogger(GatoServiceTests.class);

    @Autowired
    GatoService gatoService;

    @Test
    public void testaGetAll(){
        logger.info("RECEBENDO TODOS OS GATOS");
        List<Gato> gatos = gatoService.getAll();
        assertEquals(3, gatos.size());

    }

    @Test
    public void testaGetById() {
        assertThrows(IndexOutOfBoundsException.class, () -> gatoService.getById(5), "Indice informado fora do range!");
        logger.info("INDICE FORA DO RANGE!");
    }

}
