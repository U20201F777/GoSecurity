package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.entities.DenunciasComisaria;
import upc.edu.pe.gosecurity.repositories.IDenunciasRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasService;

import java.util.List;

@Service
public class DenunciasServiceImplement implements IDenunciasService {
    @Autowired
    private IDenunciasRepository pR;

    @Override
    public void insert(Denuncias denuncias) {
        pR.save(denuncias);
    }

    @Override
    public List<Denuncias> LIST() {
        return pR.findAll();
    }

    @Override
    public void delete(int idDenuncias) {
        pR.deleteById(idDenuncias);
    }

    @Override
    public Denuncias listId(int idDenuncias) {
        return pR.findById(idDenuncias).orElse(new Denuncias());
    }
}
