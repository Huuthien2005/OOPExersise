package exer5;

public class DepartmentB extends Employee{
    private String department;
    public DepartmentB(String IDEmployee,String name,String hometown,String sex,String phoneNumber,String department){
        super(IDEmployee,name,hometown,sex,phoneNumber);
        this.department=department;
    }
    public double getSalary(int workingDay){
        return 1.5*super.calculateSalary(workingDay);
    }
}
