package upc.edu.pe.gosecurity.entities;

import javax.persistence.Entity;
import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pertenencias")
public class Pertenencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPertenencias;
    @Column(name = "Nombre_P",length = 100,nullable = false)
    private String namePertenencias;
    @Column(name = "Ano_antiguedad",nullable = false)
    private LocalDate AnioPertenencias;
    @Column(name = "Especificaciones_ad",length = 100,nullable = false)
    private String EspecificacionesPertenencias;
    @Column(name = "Imagen_P",length = 100,nullable = false)
    private String ImagenPertenencias;
    @Column(name = "Codigo_P",length = 100,nullable = false)
    private String CodigoPertenencias;
    @Column(name = "Serie",nullable = false)
    private int SeriePertenencias;

    public Pertenencias() {
    }

    public Pertenencias(int idPertenencias, String namePertenencias, LocalDate anioPertenencias, String especificacionesPertenencias, String imagenPertenencias, String codigoPertenencias, int seriePertenencias) {
        this.idPertenencias = idPertenencias;
        this.namePertenencias = namePertenencias;
        this.AnioPertenencias = anioPertenencias;
        this.EspecificacionesPertenencias = especificacionesPertenencias;
        this.ImagenPertenencias = imagenPertenencias;
        this.CodigoPertenencias = codigoPertenencias;
        this.SeriePertenencias = seriePertenencias;
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

