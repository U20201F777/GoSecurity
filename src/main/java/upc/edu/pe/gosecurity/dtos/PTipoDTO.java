package upc.edu.pe.gosecurity.dtos;

public class PTipoDTO {
    private int idPerteneneciasTipo;
    private String namePertenenciasTipo;

    public PTipoDTO() {
    }

    public PTipoDTO(int idPerteneneciasTipo, String namePerson) {
        this.idPerteneneciasTipo = idPerteneneciasTipo;
        this.namePertenenciasTipo = namePerson;
    }

    public int getIdPerteneneciasTipo() {
        return idPerteneneciasTipo;
    }

    public void setIdPerteneneciasTipo(int idPerteneneciasTipo) {
        this.idPerteneneciasTipo = idPerteneneciasTipo;
    }

    public String getNamePerson() {
        return namePertenenciasTipo;
    }

    public void setNamePerson(String namePerson) {
        this.namePertenenciasTipo = namePerson;
    }
}

