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

    @ManyToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria comisaria;

    @ManyToOne
    @JoinColumn(name = "idNotificacion")
    private Notificacion notificacion;

    public Policia() {
    }

    public Policia(int idPolicia, int nPlaca, String fotoRostro, String fotoIdentidad, int rangoP, Comisaria comisaria, Notificacion notificacion) {
        this.idPolicia = idPolicia;
        this.nPlaca = nPlaca;
        this.fotoRostro = fotoRostro;
        this.fotoIdentidad = fotoIdentidad;
        this.rangoP = rangoP;
        this.comisaria = comisaria;
        this.notificacion = notificacion;
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

    public Comisaria getComisaria() {
        return comisaria;
    }

    public void setComisaria(Comisaria comisaria) {
        this.comisaria = comisaria;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
}

