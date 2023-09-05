package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.PertenenciasTipo;
import upc.edu.pe.gosecurity.repositories.PTipoRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.PTipoInterfaces;

import java.util.List;

@Service
public class PTipoImplements implements PTipoInterfaces {
    @Autowired
    private PTipoRepository TR;
    @Override
    public void insert(PertenenciasTipo pertenenciasTipo){

        TR.save(pertenenciasTipo);
    }
    @Override
    public List<PertenenciasTipo> list(){
        return
                TR.findAll();
    }
    @Override
    public void delete(int idPerteneneciasTipo) {

        TR.deleteById(idPerteneneciasTipo);

    }
    @Override
    public PertenenciasTipo ListId(int idPerteneneciasTipo){

        return TR.findById(idPerteneneciasTipo).orElse(new PertenenciasTipo());

    }

}
