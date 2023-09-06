package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "DenunciasComisaria")
public class DenunciasComisaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenunciasComisaria;
    @Column(name = "Comisaria",length = 100,nullable=false)
    private String nameDenunciasComisaria;
    @Column(name = "Telefono", length = 100, nullable = false)
    private String TelefonoComisaria;
    @Column(name = "Ubicacion", length = 100, nullable = false)
    private String UbicacionComisaria;

    public DenunciasComisaria() {
    }

    public DenunciasComisaria(int idDenunciasComisaria, String nameDenunciasComisaria, String telefonoComisaria, String ubicacionComisaria) {
        this.idDenunciasComisaria = idDenunciasComisaria;
        this.nameDenunciasComisaria = nameDenunciasComisaria;
        TelefonoComisaria = telefonoComisaria;
        UbicacionComisaria = ubicacionComisaria;
    }

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
