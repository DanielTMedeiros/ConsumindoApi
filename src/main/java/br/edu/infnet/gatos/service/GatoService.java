package br.edu.infnet.gatos.service;

import br.edu.infnet.gatos.model.Gato;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GatoService {
    Logger logger = LoggerFactory.getLogger(GatoService.class);
    List<Gato> gatos = initGatos();
    private List<Gato> initGatos() {
        logger.info("INICIALIZANDO LISTA DE GATOS");
        Gato gizmo = new Gato(1, "Gizmo","SRD");
        Gato jojo = new Gato(2, "Jojo", "Persa");
        Gato grandao = new Gato(3, "Grandao", "Maine Coon");
        Gato jujuba = new Gato(4, "Jujuba", "SRD");
        ArrayList<Gato> gatos = new ArrayList<>();
        gatos.add(gizmo);
        gatos.add(jojo);
        gatos.add(grandao);
        return gatos;
    }

    public List<Gato> getAll(){
        return gatos;
    }

    public Gato getById(int id){
        return gatos.get(id);
    }

    public void save(Gato gato){
        gatos.add(gato);
    }

    public Gato delete(int id){
        return gatos.remove(id);
    }

    public void update(int id, Gato gato){
        gatos.remove(id);
        gatos.add(id,gato);
    }


}
