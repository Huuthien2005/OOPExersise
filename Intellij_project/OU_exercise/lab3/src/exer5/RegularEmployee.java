package exer5;

public class RegularEmployee extends Employee{
    public RegularEmployee(String IDEmployee, String name,String hometown,String sex,String phoneNumber){
        super(IDEmployee,name,hometown,sex,phoneNumber);
    }
    public double getSalary(int workingDay){
        return super.calculateSalary(workingDay);
    }
}
