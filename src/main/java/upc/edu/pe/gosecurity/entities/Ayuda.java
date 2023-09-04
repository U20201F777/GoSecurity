package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "SolicitarAyuda")
public class Ayuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAyuda;
    @Column(name = "estadoAyuda", length = 25, nullable = false)
    private String estadoAyuda;
    @Column(name = "fechaAyuda", nullable = false)
    private LocalDate fechaAyuda;

    public Ayuda() {
    }

    public Ayuda(int idAyuda, String estadoAyuda, LocalDate fechaAyuda) {
        this.idAyuda = idAyuda;
        this.estadoAyuda = estadoAyuda;
        this.fechaAyuda = fechaAyuda;
    }

    public int getIdAyuda() {
        return idAyuda;
    }

    public void setIdAyuda(int idAyuda) {
        this.idAyuda = idAyuda;
    }

    public String getEstadoAyuda() {
        return estadoAyuda;
    }

    public void setEstadoAyuda(String estadoAyuda) {
        this.estadoAyuda = estadoAyuda;
    }

    public LocalDate getFechaAyuda() {
        return fechaAyuda;
    }

    public void setFechaAyuda(LocalDate fechaAyuda) {
        this.fechaAyuda = fechaAyuda;
    }
}
