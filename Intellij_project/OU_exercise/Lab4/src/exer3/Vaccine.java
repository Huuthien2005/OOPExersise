package exer3;

public class Vaccine {
    private static int count=0;
    private int IDvaccine;
    private String nameVaccine;
    private String origin;//xuat xu
    private int amount;
    {
        IDvaccine=++IDvaccine;
    }
    public Vaccine(int IDvaccine,String nameVaccine,String origin,int amount){
        this.IDvaccine=IDvaccine;
        this.nameVaccine=nameVaccine;
        this.origin=origin;
        this.amount=amount;
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setIDvaccine(int IDvaccine) {
        this.IDvaccine = IDvaccine;
    }

    public int getIDvaccine() {
        return IDvaccine;
    }
}
