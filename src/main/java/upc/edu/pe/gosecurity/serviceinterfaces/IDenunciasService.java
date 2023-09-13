package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.entities.DenunciasComisaria;

import java.util.List;

public interface IDenunciasService {
    public void insert(Denuncias denuncias);
    public List<Denuncias> LIST();
    public void delete(int idDenuncias);
    public Denuncias listId(int idDenuncias);


}
