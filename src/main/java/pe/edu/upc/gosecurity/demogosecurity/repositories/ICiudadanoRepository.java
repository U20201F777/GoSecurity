package pe.edu.upc.gosecurity.demogosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.gosecurity.demogosecurity.entities.Ciudadano;
@Repository
public interface ICiudadanoRepository extends JpaRepository<Ciudadano,Integer> {
}
