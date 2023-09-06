package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Denuncias;

import java.util.List;

public interface IDenunciasService {
    public void insert(Denuncias denuncias);
    public List<Denuncias> LIST();
}
