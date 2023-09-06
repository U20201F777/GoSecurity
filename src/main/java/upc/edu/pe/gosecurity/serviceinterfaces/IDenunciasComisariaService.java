package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.entities.DenunciasComisaria;

import java.util.List;

public interface IDenunciasComisariaService {
    void insert(DenunciasComisaria denunciasComisaria);
    public List<DenunciasComisaria> LIST();
}
