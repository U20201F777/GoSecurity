package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "UbicacionP")
public class UbicacionP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionP;
    @Column(name = "Latitud", length = 50, nullable = false)
    private int Latitud;
    @Column(name = "Logitud", length = 50, nullable = false)
    private int Longitud;
    @Column(name = "Fecha", nullable = false)
    private Date Fecha;
    @OneToOne
    @JoinColumn(name = "idEstadoUbicacion")
    private EstadoUbicacion estadoUbicacion;


    public UbicacionP() {
    }

    public UbicacionP(int idUbicacion, int latitud, int longitud, Date fecha, EstadoUbicacion estadoUbicacion) {
        this.idUbicacionP = idUbicacionP;
        Latitud = latitud;
        Longitud = longitud;
        Fecha = fecha;
        this.estadoUbicacion = estadoUbicacion;
    }

    public int getIdUbicacion() {
        return idUbicacionP;
    }

    public void setIdUbicacion(int idUbicacionP) {
        this.idUbicacionP = idUbicacionP;
    }

    public int getLatitud() {
        return Latitud;
    }

    public void setLatitud(int latitud) {
        Latitud = latitud;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int longitud) {
        Longitud = longitud;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public EstadoUbicacion getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(EstadoUbicacion estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }
}
