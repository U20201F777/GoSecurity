package upc.edu.pe.gosecurity.dtos;

import java.time.LocalDate;

public class AyudaDTO {
    private int idAyuda;
    private String estadoAyuda;
    private LocalDate fechaAyuda;

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
