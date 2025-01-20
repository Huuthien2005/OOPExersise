package exer_1;

public class Person {
    private String name;
    private String birthYear;
    public Person(){
        this.name="";
        this.birthYear="";
    }
    public Person(String name,String birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public Person(Person person){
        this.name=person.name;
        this.birthYear=person.birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person: {Name: "+name+", birthyear: "+birthYear;
    }
}
