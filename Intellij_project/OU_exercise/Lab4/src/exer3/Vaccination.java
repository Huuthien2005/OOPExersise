package exer3;

import java.time.LocalDate;

public class Vaccination {
    private Vaccine vaccine;
    private LocalDate injectionDate;
    private String location;
    public Vaccination(Vaccine vaccine,LocalDate injectionDate,String location){
        this.vaccine=vaccine;
        this.injectionDate=injectionDate;
        this.location=location;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getInjectionDate() {
        return injectionDate;
    }

    public void setInjectionDate(LocalDate injectionDate) {
        this.injectionDate = injectionDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
