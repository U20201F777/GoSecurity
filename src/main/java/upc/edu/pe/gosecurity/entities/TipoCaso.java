package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoCaso")
public class TipoCaso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoCaso;
    @Column(name = "TipoCaso", length = 50, nullable = false)
    private String TipoCaso;
    @Column(name = "Estado_notificacion", length = 25, nullable = false)
    private String Estado_notificacion;

    public TipoCaso() {
    }

    public TipoCaso(int idTipoCaso, String tipoCaso, String estado_notificacion) {

        this.idTipoCaso = idTipoCaso;
        TipoCaso = tipoCaso;
        Estado_notificacion = estado_notificacion;
    }

    public int getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(int idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }

    public String getTipoCaso() {
        return TipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        TipoCaso = tipoCaso;
    }

    public String getEstado_notificacion() {
        return Estado_notificacion;
    }

    public void setEstado_notificacion(String estado_notificacion) {
        Estado_notificacion = estado_notificacion;
    }
}