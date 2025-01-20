package exer3;

import java.time.LocalDate;

public class Foreigner extends Person{
    private String IDpassport;
    private String nationality;
    public Foreigner(String IDPerson, String name, String sex, String phoneNumber, LocalDate birthDate,String IDpassport,String nationality){
        super(IDPerson,name,sex,phoneNumber,birthDate);
        this.IDpassport=IDpassport;
        this.nationality=nationality;
    }

    public String getIDpassport() {
        return IDpassport;
    }

    public void setIDpassport(String IDpassport) {
        this.IDpassport = IDpassport;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
