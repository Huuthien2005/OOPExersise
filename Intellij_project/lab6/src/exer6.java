class Manager extends Employee{
    private String position;
    private String department;
    private double salaryCoefficientPosition;
    public Manager(){
        super();
        super.setCoefficientsSalary(5.0);
    }
    public Manager(String id, String fullName, double coefficientSalary,String position,double salaryCoefficientPosition){
        super(id,fullName,coefficientSalary);
        this.position=position;
        this.salaryCoefficientPosition=salaryCoefficientPosition;
    }
    public Manager(String id, String fullName, double coefficientSalary,String position,double salaryCoefficientPosition,int yearJoinded,int numDaysOff,String department){
        super(id,fullName,coefficientSalary,yearJoinded,numDaysOff);
        this.position=position;
        this.department=department;
        this.salaryCoefficientPosition=salaryCoefficientPosition;
    }
    public String considerEmulation(){
        return "grade A";
    }
    public double bonusByPosition(){
        return getBasicSalary()*salaryCoefficientPosition;
    }
    public double getSalary(){
        return getBasicSalary()*super.getCoefficientsSalary()*super.emulationCoefficient()+super.getSenioritySalary()+bonusByPosition();
    }
}
public class exer6 {
    public static void main(String[] args){
        Employee employee = new Employee("2351050170","Cao Huu Thien",2,2005,2);
        Manager manager = new Manager("2351050170","Cao Huu Thien",2,"AI Engineering",2,2000,10,"Big Tech");
        System.out.println(employee);
        System.out.println(employee.getSalary());
        System.out.println(employee.getSenioritySalary());
        System.out.println(employee.emulationCoefficient());
        System.out.println(manager);
        System.out.println(manager.getSalary());
    }
}
