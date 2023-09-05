package upc.edu.pe.gosecurity.dtos;

public class PTipoDTO {
    private int idPerteneneciasTipo;
    private String namePerson;

    public PTipoDTO() {
    }

    public PTipoDTO(int idPerteneneciasTipo, String namePerson) {
        this.idPerteneneciasTipo = idPerteneneciasTipo;
        this.namePerson = namePerson;
    }

    public int getIdPerteneneciasTipo() {
        return idPerteneneciasTipo;
    }

    public void setIdPerteneneciasTipo(int idPerteneneciasTipo) {
        this.idPerteneneciasTipo = idPerteneneciasTipo;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}
