package exer5;

public class DepartmentA extends Employee{
    private String department;
    public DepartmentA(String IDEmployee,String name,String hometown,String sex,String phoneNumber,String department){
        super(IDEmployee,name,hometown,sex,phoneNumber);
        this.department=department;
    }
    public double getSalary(int workingDay){
        return 1.2*super.calculateSalary(workingDay);
    }
}
