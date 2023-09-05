package upc.edu.pe.gosecurity.dtos;

public class PModeloDTO {
    private int idPertenenciasModelo;
    private String namePertenenciasModelo;

    public PModeloDTO() {
    }

    public PModeloDTO(int idPertenenciasModelo, String namePertenenciasModelo) {
        this.idPertenenciasModelo = idPertenenciasModelo;
        this.namePertenenciasModelo = namePertenenciasModelo;
    }

    public int getIdPertenenciasModelo() {
        return idPertenenciasModelo;
    }

    public void setIdPertenenciasModelo(int idPertenenciasModelo) {
        this.idPertenenciasModelo = idPertenenciasModelo;
    }

    public String getNamePertenenciasModelo() {
        return namePertenenciasModelo;
    }

    public void setNamePertenenciasModelo(String namePertenenciasModelo) {
        this.namePertenenciasModelo = namePertenenciasModelo;
    }
}
