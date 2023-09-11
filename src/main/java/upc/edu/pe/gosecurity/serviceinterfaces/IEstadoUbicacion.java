package upc.edu.pe.gosecurity.serviceinterfaces;


import upc.edu.pe.gosecurity.entities.EstadoUbicacion;

public interface IEstadoUbicacion {

    public void insert(EstadoUbicacion estadoUbicacion);

    public void delete(int idEstadoUbicacion);
}
