package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "PertenenciasTipo")
public class PertenenciasTipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerteneneciasTipo;
    @Column (name = "namePerteneciasTipo",length = 100,nullable = false)
    private String namePerson;

    public PertenenciasTipo() {
    }

    public PertenenciasTipo(int idPerteneneciasTipo, String namePerson) {
        this.idPerteneneciasTipo = idPerteneneciasTipo;
        this.namePerson = namePerson;
    }

    public int getIdPerteneneciasTipo() {
        return idPerteneneciasTipo;
    }

    public void setIdPerteneneciasTipo(int idPerteneneciasTipo) {
        this.idPerteneneciasTipo = idPerteneneciasTipo;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}
