package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Policia")
public class Policia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPolicia;
    @Column(name = "nPlaca", length = 20, nullable = false)
    private int nPlaca;
    @Column(name = "fotoRostro", length = 225, nullable = false)
    private String fotoRostro;
    @Column(name = "fotoIdentidad", length = 225, nullable = false)
    private String fotoIdentidad;
    @Column(name = "rangoP", length = 20, nullable = false)
    private int rangoP;

    public Policia() {
    }

    public Policia(int idPolicia, int nPlaca, String fotoRostro, String fotoIdentidad, int rangoP) {
        this.idPolicia = idPolicia;
        this.nPlaca = nPlaca;
        this.fotoRostro = fotoRostro;
        this.fotoIdentidad = fotoIdentidad;
        this.rangoP = rangoP;
    }

    public int getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(int idPolicia) {
        this.idPolicia = idPolicia;
    }

    public int getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(int nPlaca) {
        this.nPlaca = nPlaca;
    }

    public String getFotoRostro() {
        return fotoRostro;
    }

    public void setFotoRostro(String fotoRostro) {
        this.fotoRostro = fotoRostro;
    }

    public String getFotoIdentidad() {
        return fotoIdentidad;
    }

    public void setFotoIdentidad(String fotoIdentidad) {
        this.fotoIdentidad = fotoIdentidad;
    }

    public int getRangoP() {
        return rangoP;
    }

    public void setRangoP(int rangoP) {
        this.rangoP = rangoP;
    }
}

