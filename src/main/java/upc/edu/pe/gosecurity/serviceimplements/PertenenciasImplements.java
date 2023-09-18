package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Pertenencias;
import upc.edu.pe.gosecurity.repositories.PertenenciasRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.PertenenciasInterfaces;

import java.util.List;

@Service
public class PertenenciasImplements implements PertenenciasInterfaces {
    @Autowired
    private PertenenciasRepository PR;

    @Override
    public void insert(Pertenencias pertenencias){

        PR.save(pertenencias);
    }
    @Override
    public List<Pertenencias> list(){
        return
                PR.findAll();
    }
    @Override
    public void delete(int idPertenencias){
        PR.deleteById(idPertenencias);
    }
    @Override
    public Pertenencias ListId(int idPertenencias){
        return PR.findById(idPertenencias).orElse(new Pertenencias());
    }

    @Override
    public List<Pertenencias> findByNamePertenencias(String namePertenencias) {
        return PR.findByNamePertenencias(namePertenencias);
    }
}

