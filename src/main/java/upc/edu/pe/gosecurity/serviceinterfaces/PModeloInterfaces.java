package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.PertenenciasModelo;

import java.util.List;

public interface PModeloInterfaces {
    public void insert(PertenenciasModelo pertenenciasModelo);
    public List<PertenenciasModelo> list();
    public void delete(int idPertenenciasModelo);
    public PertenenciasModelo ListId(int idPertenenciasModelo);

    List<PertenenciasModelo>findByNamePertenenciasModelo (String namePertenenciasModelo);
}
