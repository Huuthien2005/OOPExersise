package exer5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalaryManagement {
    public static List<Employee> employeeManagement=new ArrayList<>();
    private final Scanner scanner=new Scanner(System.in);

    public void addEmployee(Employee E){
        employeeManagement.add(E);
    }
    public void addEmployee(Employee... E){
        employeeManagement.addAll(Arrays.asList(E));
    }
    public void addEmployee(){
        System.out.print("Enter CCCD: ");
        String IDemployee=scanner.nextLine();
        System.out.print("Enter employee's name: ");
        String name=scanner.nextLine();
        System.out.print("Enter hometown: ");
        String hometown=scanner.nextLine();
        System.out.print("Enter sex: ");
        String sex=scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber=scanner.nextLine();
        System.out.print("Enter department: A/B/C/D (if regular employee, please skip it! ");
        String department=scanner.nextLine();
        Employee employee=null;
        switch(department.toUpperCase()){
            case "A":
                employee=new DepartmentA(IDemployee,name,hometown,sex,phoneNumber,department.toUpperCase());
                break;
            case "B":
                employee =new DepartmentB(IDemployee,name,hometown,sex,phoneNumber,department.toUpperCase());
                break;
            case "C":
                employee=new DepartmentC(IDemployee,name,hometown,sex,phoneNumber,department.toUpperCase());
                break;
            case "D":
                System.out.print("enter allowance: ");
                double allowance= scanner.nextDouble();
                employee=new DepartmentD(IDemployee,name,hometown,sex,phoneNumber,department.toUpperCase(),allowance);
                break;
            case "":
                employee=new RegularEmployee(IDemployee,name,hometown,sex,phoneNumber);
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        employeeManagement.add(employee);
    }
    public void removeEmployee(){
        System.out.print("Enter employee ID you want to delete: ");
        String IDemployee=scanner.nextLine();
        employeeManagement.removeIf(employee -> employee.IDEmployee.equalsIgnoreCase(IDemployee));
        System.out.println("employee have ID "+IDemployee+" is deleted");
    }
    public void display(){
        for(Employee E:employeeManagement){
            E.display();
            System.out.println("\n");
        }
    }
    public void searchEmployeeByKeyword(){
        System.out.print("type CCCD/name/hometown employee you want to search: ");
        String Keyword=scanner.nextLine();
        for(Employee em:employeeManagement) {
            if (em.IDEmployee.equalsIgnoreCase(Keyword) || em.hometown.equalsIgnoreCase(Keyword) || em.name.equalsIgnoreCase(Keyword)) {
                em.display();
                return;
            }
        }
    }
    public void getSalaryEmployee(){
        for(Employee em:employeeManagement){
            System.out.print("type number of working day of "+em.name+": ");
            int workingDays=Integer.parseInt(scanner.nextLine());
            em.getSalary(workingDays);
            em.display();
            System.out.println("a number of working days: "+ workingDays);
            System.out.println("Salary: "+em.getSalary(workingDays));
            System.out.println("\n");
        }
    }
    public void menu(){
        String choice;
        do{
            System.out.println("\t\t\t\t\t\t\tMENU\t\t\t");
            System.out.println("1. To add employee ");
            System.out.println("2. To delete employee");
            System.out.println("3. To search employee");
            System.out.println("4. To display employee list");
            System.out.println("5. To calculate employee'salary");
            System.out.println("6. To quit program");
            System.out.print("Enter your choice: ");
            choice=scanner.nextLine();
            System.out.println("\n");
            switch(choice){
                case "1":
                    addEmployee();
                    break;
                case "2":
                    removeEmployee();
                    break;
                case "3":
                    searchEmployeeByKeyword();
                    break;
                case "4":
                    display();
                    break;
                case "5":
                    getSalaryEmployee();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        } while(!choice.equalsIgnoreCase("6"));
    }
}
