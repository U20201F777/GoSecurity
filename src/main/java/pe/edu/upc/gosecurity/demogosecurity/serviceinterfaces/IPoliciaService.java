package pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces;

import pe.edu.upc.gosecurity.demogosecurity.entities.Policia;
import pe.edu.upc.gosecurity.demogosecurity.entities.Usuario;

import java.util.List;

public interface IPoliciaService {
    public void insert(Policia policia);
    public List<Policia> list();
}
