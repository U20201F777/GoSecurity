package upc.edu.pe.gosecurity.dtos;

public class PColorDTO {
    private int idPertenenciasColor;
    private String namePertenenciasColor;

    public PColorDTO() {
    }

    public PColorDTO(int idPertenenciasColor, String namePertenenciasColor) {
        this.idPertenenciasColor = idPertenenciasColor;
        this.namePertenenciasColor = namePertenenciasColor;
    }

    public int getIdPertenenciasColor() {
        return idPertenenciasColor;
    }

    public void setIdPertenenciasColor(int idPertenenciasColor) {
        this.idPertenenciasColor = idPertenenciasColor;
    }

    public String getNamePertenenciasColor() {
        return namePertenenciasColor;
    }

    public void setNamePertenenciasColor(String namePertenenciasColor) {
        this.namePertenenciasColor = namePertenenciasColor;
    }
}

