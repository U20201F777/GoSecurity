package pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces;

import pe.edu.upc.gosecurity.demogosecurity.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario>list();
    public void delete(int idUsuario);
}
