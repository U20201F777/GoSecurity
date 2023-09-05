package pe.edu.upc.gosecurity.demogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.gosecurity.demogosecurity.entities.Usuario;
import pe.edu.upc.gosecurity.demogosecurity.repositories.IUsuarioRepository;
import pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplements implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }
}
