package exer5;

public class DepartmentD extends Employee{
    private String department;
    private double allowance;
    public DepartmentD(String IDEmployee,String name,String hometown,String sex,String phoneNumber,String department,double allowance){
        super(IDEmployee,name,hometown,sex,phoneNumber);
        this.department=department;
        this.allowance=allowance;
    }
    public double getSalary(int workingDay){
        return allowance+super.calculateSalary(workingDay);
    }
}
