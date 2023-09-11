package upc.edu.pe.gosecurity.dtos;

public class TipoCasoDTO {
    private int idTipoCaso;
    private String TipoCaso;
    private String Estado_notificacion;
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
