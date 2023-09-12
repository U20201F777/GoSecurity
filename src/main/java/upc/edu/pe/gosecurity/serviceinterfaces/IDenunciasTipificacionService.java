package upc.edu.pe.gosecurity.serviceinterfaces;

import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.entities.DenunciasTipificacion;

import java.util.List;

public interface IDenunciasTipificacionService {
    void insert(DenunciasTipificacion denunciasTipificacion);
    public List<DenunciasTipificacion> LIST();
}