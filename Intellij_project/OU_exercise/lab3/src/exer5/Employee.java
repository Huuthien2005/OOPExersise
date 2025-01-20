package exer5;

public abstract class Employee {
    protected int IDnumber;
    protected String IDEmployee;
    protected String name;
    protected String hometown;
    protected String sex;
    protected String phoneNumber;
    protected static int count=0;
    private static final double Base_Salary= 100000;
    {
        count++;
        this.IDnumber=count;
    }

    public Employee(String IDEmployee,String name,String hometown,String sex, String phoneNumber){
        this.IDEmployee=IDEmployee;
        this.name=name;
        this.hometown=hometown;
        this.sex=sex;
        this.phoneNumber=phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIDEmployee() {
        return IDEmployee;
    }

    public void setIDEmployee(String IDEmployee) {
        this.IDEmployee = IDEmployee;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public static double getBase_Salary() {
        return Base_Salary;
    }

    public double calculateSalary(int workingDay){
        return Base_Salary*workingDay;
    }
    public void display(){
        System.out.println("bussines employee's ID: "+IDnumber);
        System.out.println("Employee ID: "+IDEmployee);
        System.out.println("Employee name: "+name);
        System.out.println("Hometown: "+hometown);
        System.out.println("Sex: "+sex);
        System.out.println("Phone number: "+phoneNumber);
    }
    public abstract double getSalary(int workingDay);
}

