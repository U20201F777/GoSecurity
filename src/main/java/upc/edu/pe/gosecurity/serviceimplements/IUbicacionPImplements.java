package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.UbicacionP;
import upc.edu.pe.gosecurity.repositories.UbicacionPRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.IUbicacionPService;

import java.util.List;
@Service
public class IUbicacionPImplements implements IUbicacionPService {

    @Autowired
    private UbicacionPRepository uR;
    @Override
    public void insert(UbicacionP ubicacionP) {
        uR.save(ubicacionP);
    }

    @Override
    public List<UbicacionP> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUbicacionP) {
        uR.deleteById(idUbicacionP);
    }

    @Override
    public UbicacionP listId(int idUbicacionP) {
        return uR.findById(idUbicacionP).orElse(new UbicacionP());
    }
}
