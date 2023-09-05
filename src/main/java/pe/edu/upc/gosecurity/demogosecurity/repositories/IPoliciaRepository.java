package pe.edu.upc.gosecurity.demogosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.gosecurity.demogosecurity.entities.Policia;
@Repository
public interface IPoliciaRepository extends JpaRepository<Policia,Integer> {
}
