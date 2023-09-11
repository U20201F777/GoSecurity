package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.EstadoUbicacion;

import java.util.Date;

public class UbicacionPDTO {

    private int idUbicacionP;

    private int Latitud;

    private int Longitud;

    private Date Fecha;

    private EstadoUbicacion estadoUbicacion;

    public int getIdUbicacion() {
        return idUbicacionP;
    }

    public void setIdUbicacion(int idUbicacion) {
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
