package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Ubicacion")
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacion;
    @Column(name = "Latitud", length = 50, nullable = false)
    private int Latitud;
    @Column(name = "Logitud", length = 50, nullable = false)
    private int Longitud;
    @Column(name = "Fecha", nullable = false)
    private Date Fecha;

    public Ubicacion() {
    }

    public Ubicacion(int idUbicacion, int latitud, int longitud, Date fecha) {
        this.idUbicacion = idUbicacion;
        Latitud = latitud;
        Longitud = longitud;
        Fecha = fecha;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
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
}
