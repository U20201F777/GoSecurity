package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Pertenencias;

import java.util.List;

public interface PertenenciasInterfaces {
    public void insert(Pertenencias pertenencias);
    public List<Pertenencias> list();
    public void delete(int idPertenencias);
    public Pertenencias ListId(int idPertenencias);

    List<Pertenencias>findByNamePertenencias(String namePertenencias);
}
