package exer3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String IDPerson;
    private String name;
    private String sex;
    private String phoneNumber;
    private LocalDate birthDate;
    private List<Vaccination> vaccinations=new ArrayList<>();
    public Person(String IDPerson,String name,String sex,String phoneNumber,LocalDate birthDate){
        this.IDPerson=IDPerson;
        this.name=name;
        this.sex=sex;
        this.phoneNumber=phoneNumber;
        this.birthDate=birthDate;
    }
    public boolean isAbove18(){
        LocalDate currentDate=LocalDate.now();
        if(birthDate.plusYears(18).compareTo(currentDate)>0)
            return true;
        return false;
    }
    public boolean checkConditionToVaccine(){
        if(vaccinations.size()>=3&&isAbove18())
        {
            System.out.println("You can get vaccine!");
            return true;
        }
        else
        {
            if(vaccinations.size()>=3)
                System.out.println("You've already have 3 vaccine!");
            else
                System.out.println("you do not have enough age to get vaccine!");
            return false;
        }
    }
    public String getIDPerson() {
        return IDPerson;
    }

    public void setIDPerson(String IDPerson) {
        this.IDPerson = IDPerson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }
}
