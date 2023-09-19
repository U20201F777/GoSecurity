package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.DenunciasLugarHecho;
import upc.edu.pe.gosecurity.repositories.IDenunciasLugarHechoRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasLugarHechoService;

import java.util.List;

@Service
public class DenunciasLugarHechoServiceImplement implements IDenunciasLugarHechoService {
    @Autowired
    private IDenunciasLugarHechoRepository pR;

    @Override
    public void insert(DenunciasLugarHecho denunciasLugarHecho) {
        pR.save(denunciasLugarHecho);
    }

    @Override
    public List<DenunciasLugarHecho> LIST() {
        return pR.findAll();
    }

    @Override
    public void delete(int idDenunciasLugarHecho) {
        pR.deleteById(idDenunciasLugarHecho);
    }

    @Override
    public DenunciasLugarHecho listId(int idDenunciasLugarHecho) {
        return pR.findById(idDenunciasLugarHecho).orElse(new DenunciasLugarHecho());
    }

    @Override
    public List<DenunciasLugarHecho> findByNameDenunciasLugarHecho(String nameDenunciasLugarHechoComisaria) {
        return pR.findByNameDenunciasLugarHecho(nameDenunciasLugarHechoComisaria);
    }


}