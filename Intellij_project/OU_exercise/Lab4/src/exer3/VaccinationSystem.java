package exer3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VaccinationSystem {
    public static List<Vaccine> vaccines=new ArrayList<>();
    private static List<Person> persons=new ArrayList<>();
    final Scanner sc=new Scanner(System.in);

    public void displayVaccines(){
        vaccines.forEach(vaccine -> System.out.println("name vaccine: "+vaccine.getNameVaccine()+"- origin: "+vaccine.getOrigin()+"- amount: "+vaccine.getAmount()));
    }
    public void displayForeigner(){
        for(Person person:persons){
            if(person instanceof Foreigner){
                System.out.println("Name: "+person.getName());
                System.out.println("Sex: "+person.getSex());
                System.out.println("Nationality: "+((Foreigner) person).getNationality());
                System.out.println("ID passport: "+((Foreigner) person).getIDpassport());
                System.out.println("\n");
            }
        }
    }
    public void recordVaccination(int IDvaccine,String IDPerson,String location){
        if(IDPerson==null||IDPerson.isEmpty()||location==null||location.isEmpty())
            return;
        Vaccine vac=vaccines.stream().filter(vaccine -> vaccine.getIDvaccine()==IDvaccine).findFirst().orElse(null);
        Person p=persons.stream().filter(person -> person.getIDPerson().equalsIgnoreCase(IDPerson)).findFirst().orElse(null);
        if(!p.checkConditionToVaccine())
            return;
        if(vac==null||vac.getAmount()<=0)
            return;
        if(p.getVaccinations()==null)
            p.setVaccinations(new ArrayList<>());
        p.getVaccinations().add(new Vaccination(vac,LocalDate.now(),location));
        vac.setAmount(vac.getAmount()-1);
    }
    public boolean checkVaccinationEligible(String IDPerson){
        Person p=persons.stream().filter(person -> person.getIDPerson().equalsIgnoreCase(IDPerson)).findFirst().orElse(null);
        if(p==null)
            return false;
        return p.checkConditionToVaccine();
    }
    public void displayPeopleWithmorethan2Vaccine(){
        persons.stream().filter(person -> person.checkConditionToVaccine()).forEach(p->
                {
                    System.out.println(p);
                    p.getVaccinations().forEach(vaccination -> System.out.println(vaccination));
                }
        );
    }
    public void sortVaccine(){
        vaccines.sort(Comparator.comparing(Vaccine::getOrigin).thenComparing(Vaccine::getAmount).reversed());
    }
    public void addSampleData() {
        // Thêm vắc xin
        /*vaccines.add(new Vaccine("AstraZeneca", "Anh", 1000));
        vaccines.add(new Vaccine("Pfizer", "Mỹ", 2000));
        vaccines.add(new Vaccine("Moderna", "Mỹ", 1500));
        vaccines.add(new Vaccine("Sinopharm", "Trung Quốc", 3000));*/
        vaccines.add(new Vaccine(1000, "AstraZeneca", "Anh",18));
        vaccines.add(new Vaccine(2000, "Pfizer", "Mỹ",20));
        vaccines.add(new Vaccine(1500, "Moderna","Mỹ" ,25));
        vaccines.add(new Vaccine(3000, "Sinopharm", "Trung Quốc",30));

        // Thêm người Việt Nam
        Person vietnamese = new Vietnamese("123456789", "Nguyễn Văn A", "Nam",
                "0123456789", LocalDate.of(1990, 1, 1));
        persons.add(vietnamese);

        // Thêm người nước ngoài
        Foreigner foreigner = new Foreigner("987654321", "John Smith", "Nam",
                "0987654321", LocalDate.of(1985, 6, 15),
                "AB123456", "Mỹ");
        persons.add(foreigner);
    }

    public static List<Vaccine> getVaccines() {
        return vaccines;
    }

    public static void setListVaccines(List<Vaccine> listVaccines) {
        VaccinationSystem.vaccines = listVaccines;
    }

    public static List<Person> getListPersons() {
        return persons;
    }

    public static void setListPersons(List<Person> listPersons) {
        VaccinationSystem.persons = listPersons;
    }
}
