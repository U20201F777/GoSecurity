package pe.edu.upc.gosecurity.demogosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.gosecurity.demogosecurity.entities.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Integer> {

}
