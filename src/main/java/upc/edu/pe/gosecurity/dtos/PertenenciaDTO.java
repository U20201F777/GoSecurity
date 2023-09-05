package upc.edu.pe.gosecurity.dtos;

import java.time.LocalDate;

public class PertenenciaDTO {
    private int idPertenencias;
    private String namePertenencias;
    private LocalDate AnioPertenencias;
    private String EspecificacionesPertenencias;
    private String ImagenPertenencias;
    private String CodigoPertenencias;
    private int SeriePertenencias;

    public PertenenciaDTO() {
    }

    public PertenenciaDTO(int idPertenencias, String namePertenencias, LocalDate anioPertenencias, String especificacionesPertenencias, String imagenPertenencias, String codigoPertenencias, int seriePertenencias) {
        this.idPertenencias = idPertenencias;
        this.namePertenencias = namePertenencias;
        AnioPertenencias = anioPertenencias;
        EspecificacionesPertenencias = especificacionesPertenencias;
        ImagenPertenencias = imagenPertenencias;
        CodigoPertenencias = codigoPertenencias;
        SeriePertenencias = seriePertenencias;
    }

    public int getIdPertenencias() {
        return idPertenencias;
    }

    public void setIdPertenencias(int idPertenencias) {
        this.idPertenencias = idPertenencias;
    }

    public String getNamePertenencias() {
        return namePertenencias;
    }

    public void setNamePertenencias(String namePertenencias) {
        this.namePertenencias = namePertenencias;
    }

    public LocalDate getAnioPertenencias() {
        return AnioPertenencias;
    }

    public void setAnioPertenencias(LocalDate anioPertenencias) {
        AnioPertenencias = anioPertenencias;
    }

    public String getEspecificacionesPertenencias() {
        return EspecificacionesPertenencias;
    }

    public void setEspecificacionesPertenencias(String especificacionesPertenencias) {
        EspecificacionesPertenencias = especificacionesPertenencias;
    }

    public String getImagenPertenencias() {
        return ImagenPertenencias;
    }

    public void setImagenPertenencias(String imagenPertenencias) {
        ImagenPertenencias = imagenPertenencias;
    }

    public String getCodigoPertenencias() {
        return CodigoPertenencias;
    }

    public void setCodigoPertenencias(String codigoPertenencias) {
        CodigoPertenencias = codigoPertenencias;
    }

    public int getSeriePertenencias() {
        return SeriePertenencias;
    }

    public void setSeriePertenencias(int seriePertenencias) {
        SeriePertenencias = seriePertenencias;
    }
}
