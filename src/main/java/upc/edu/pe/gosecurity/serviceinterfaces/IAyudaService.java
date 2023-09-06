package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Ayuda;

import java.util.List;

public interface IAyudaService{
    public void insert(Ayuda ayuda);
    public List<Ayuda> list();
    public void delete(int idAyuda);
    public Ayuda listId(int idAyuda);

}
