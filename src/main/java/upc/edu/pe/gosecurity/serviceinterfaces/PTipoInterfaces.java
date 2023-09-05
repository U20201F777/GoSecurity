package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.PertenenciasTipo;

import java.util.List;

public interface PTipoInterfaces {
    public void insert(PertenenciasTipo pertenenciasTipo);
    public List<PertenenciasTipo> list();
    public void delete(int idPerteneneciasTipo);
    public PertenenciasTipo ListId(int idPerteneneciasTipo);
}
