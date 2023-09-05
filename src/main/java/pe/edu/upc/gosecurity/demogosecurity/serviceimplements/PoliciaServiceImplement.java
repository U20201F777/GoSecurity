package pe.edu.upc.gosecurity.demogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.gosecurity.demogosecurity.entities.Policia;
import pe.edu.upc.gosecurity.demogosecurity.repositories.IPoliciaRepository;
import pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces.IPoliciaService;

import java.util.List;

@Service
public class PoliciaServiceImplement implements IPoliciaService {
    @Autowired
    private IPoliciaRepository pR;

    @Override
    public void insert(Policia policia) {
        pR.save(policia);
    }

    @Override
    public List<Policia> list() {
        return pR.findAll();
    }
}
