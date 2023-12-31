package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.PertenenciasMarca;
import upc.edu.pe.gosecurity.repositories.PMarcaRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.PMarcaInterfaces;

import java.util.List;

@Service
public class PMarcaImplements implements PMarcaInterfaces {
    @Autowired
    private PMarcaRepository MarR;

    @Override
    public void insert(PertenenciasMarca pertenenciasMarca){
        MarR.save(pertenenciasMarca);
    }
    @Override
    public List<PertenenciasMarca> list(){
        return
                MarR.findAll();
    }
    @Override
    public void delete(int idPertenenciasMarca){

        MarR.deleteById(idPertenenciasMarca);
    }
    @Override
    public PertenenciasMarca ListId(int idPertenenciasMarca){
        return MarR.findById(idPertenenciasMarca).orElse(new PertenenciasMarca());
    }

    @Override
    public List<PertenenciasMarca> findByNamePertenenciasMarca(String namePertenenciasMarca) {
        return MarR.findByNamePertenenciasMarca(namePertenenciasMarca);
    }
}

