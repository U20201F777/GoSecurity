package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {

    public void insert(Ubicacion ubicacion);
    public List<Ubicacion> list();
    public void delete(int idUbicacion);
    public Ubicacion listId(int idUbicacion);

}
