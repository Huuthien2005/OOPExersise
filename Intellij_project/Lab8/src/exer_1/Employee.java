package exer_1;

public class Employee extends Person{
    private String id;
    private double salary;
    public Employee(){
        super();
        this.id="";
        this.salary=0.0;
    }
    public Employee(String id,double salary,String name,String birthYear){
        super(name,birthYear);
        this.id=id;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: { name: "+getName()+", birthYear: "+getBirthYear()+", id: "+id+", salary: "+salary;
    }
}
