package upc.edu.pe.gosecurity.dtos;

public class PMarcaDTO {
    private int idPertenenciasMarca;
    private String namePertenenciasMarca;

    public PMarcaDTO() {
    }

    public PMarcaDTO(int idPertenenciasMarca, String namePertenenciasMarca) {
        this.idPertenenciasMarca = idPertenenciasMarca;
        this.namePertenenciasMarca = namePertenenciasMarca;
    }

    public int getIdPertenenciasMarca() {
        return idPertenenciasMarca;
    }

    public void setIdPertenenciasMarca(int idPertenenciasMarca) {
        this.idPertenenciasMarca = idPertenenciasMarca;
    }

    public String getNamePertenenciasMarca() {
        return namePertenenciasMarca;
    }

    public void setNamePertenenciasMarca(String namePertenenciasMarca) {
        this.namePertenenciasMarca = namePertenenciasMarca;
    }
}

