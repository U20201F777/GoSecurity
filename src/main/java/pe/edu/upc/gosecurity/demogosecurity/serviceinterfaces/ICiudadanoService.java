package pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces;

import pe.edu.upc.gosecurity.demogosecurity.entities.Ciudadano;
import pe.edu.upc.gosecurity.demogosecurity.entities.Usuario;

import java.util.List;

public interface ICiudadanoService {
    public void insert(Ciudadano ciudadano);
    public List<Ciudadano> list();
}
