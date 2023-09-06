package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.DenunciasComisaria;
import upc.edu.pe.gosecurity.repositories.IDenunciasComisariaRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasComisariaService;

import java.util.List;

@Service
public class DenunciasComisariaServiceImplement implements IDenunciasComisariaService {
    @Autowired
    private IDenunciasComisariaRepository pR;

    @Override
    public void insert(DenunciasComisaria denunciasComisaria) {
        pR.save(denunciasComisaria);
    }

    @Override
    public List<DenunciasComisaria> LIST() {
        return pR.findAll();
    }
}
