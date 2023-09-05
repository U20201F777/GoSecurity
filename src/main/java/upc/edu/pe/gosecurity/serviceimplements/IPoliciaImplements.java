package upc.edu.pe.gosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.repositories.PoliciaRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.IPoliciaService;

import java.util.List;
@Service
public class IPoliciaImplements extends IPoliciaService {

    @Autowired
    private PoliciaRepository pR;
    @Override
    public void insert(Policia policia) {
        pR.save(policia);
    }

    @Override
    public List<Policia> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPolicia) {
        pR.deleteById(idPolicia);
    }

    @Override
    public Policia listId(int idPolicia) {
        return pR.findById(idPolicia).orElse(new Policia());
    }
}
