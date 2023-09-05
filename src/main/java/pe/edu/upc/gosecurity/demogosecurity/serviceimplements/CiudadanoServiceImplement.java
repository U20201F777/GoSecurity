package pe.edu.upc.gosecurity.demogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.gosecurity.demogosecurity.entities.Ciudadano;
import pe.edu.upc.gosecurity.demogosecurity.repositories.ICiudadanoRepository;
import pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces.ICiudadanoService;

import java.util.List;

@Service
public class CiudadanoServiceImplement implements ICiudadanoService {
    @Autowired
    private ICiudadanoRepository cR;

    @Override
    public void insert(Ciudadano ciudadano) {
        cR.save(ciudadano);
    }

    @Override
    public List<Ciudadano> list() {
        return cR.findAll();
    }
}
