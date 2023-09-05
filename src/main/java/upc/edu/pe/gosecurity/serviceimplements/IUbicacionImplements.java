package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Ubicacion;
import upc.edu.pe.gosecurity.repositories.UbicacionRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.IUbicacionService;

import java.util.List;
@Service
public class IUbicacionImplements implements IUbicacionService {

    @Autowired
    private UbicacionRepository uR;
    @Override
    public void insert(Ubicacion ubicacion) {
        uR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUbicacion) {
        uR.deleteById(idUbicacion);
    }

    @Override
    public Ubicacion listId(int idUbicacion) {
        return uR.findById(idUbicacion).orElse(new Ubicacion());
    }
}
