package upc.edu.pe.gosecurity.dtos;

public class DenunciasComisariaDTO {
    private int idDenunciasComisaria;
    private String nameDenunciasComisaria;
    private String TelefonoComisaria;
    private String UbicacionComisaria;

    public int getIdDenunciasComisaria() {
        return idDenunciasComisaria;
    }

    public void setIdDenunciasComisaria(int idDenunciasComisaria) {
        this.idDenunciasComisaria = idDenunciasComisaria;
    }

    public String getNameDenunciasComisaria() {
        return nameDenunciasComisaria;
    }

    public void setNameDenunciasComisaria(String nameDenunciasComisaria) {
        this.nameDenunciasComisaria = nameDenunciasComisaria;
    }

    public String getTelefonoComisaria() {
        return TelefonoComisaria;
    }

    public void setTelefonoComisaria(String telefonoComisaria) {
        TelefonoComisaria = telefonoComisaria;
    }

    public String getUbicacionComisaria() {
        return UbicacionComisaria;
    }

    public void setUbicacionComisaria(String ubicacionComisaria) {
        UbicacionComisaria = ubicacionComisaria;
    }
}
