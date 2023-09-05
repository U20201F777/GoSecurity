package upc.edu.pe.gosecurity.dtos;

import javax.persistence.Column;

public class PoliciaDTO {

    private int idPolicia;

    private int nPlaca;

    private String fotoRostro;

    private String fotoIdentidad;

    private int rangoP;

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
