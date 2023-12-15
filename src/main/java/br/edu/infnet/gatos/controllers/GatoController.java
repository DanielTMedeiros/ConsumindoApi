package br.edu.infnet.gatos.controllers;

import br.edu.infnet.gatos.model.Gato;
import br.edu.infnet.gatos.service.GatoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/gato")
public class GatoController {
    @Autowired
    GatoService gatoService;
    Logger logger = LoggerFactory.getLogger(GatoController.class);


    @GetMapping()
    public List<Gato> getAll(){
        logger.info("GET ALL GATOS");
        return gatoService.getAll();
    }

    @GetMapping("/{id}")
    public Gato getById(@PathVariable int id){
        logger.info("GET GATO: " + id);
        return gatoService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Gato gato){
        logger.info("CREATE GATO: " + gato);
        gatoService.save(gato);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        logger.info("DELETE GATO: " +id);
        Gato removed = gatoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Gato gato){
        logger.info("UPDATE GATO: " + id + " novo gato: " +gato );
        gatoService.update(id, gato);
    }

}
