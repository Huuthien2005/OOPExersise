class Person{
    private String name;
    private String address;
    public Person(){
        this.name="";
        this.address="";
    }
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return "name-"+name+"-address-"+address;
    }
}
class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(){
        super();
        this.program="";
        this.year=0;
        this.fee=0.0;
    }
    public Student(String name,String address,String program,int year,double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public String toString(){
        return "name-"+super.getName()+"-address-"+super.getAddress()+"-program-"+program+"-year-"+year+"-fee-"+ fee;
    }
}


class Staff extends Person{
    private String school;
    private double pay;
    public Staff(){
        super();
        this.school="";
        this.pay=0.0;
    }
    public Staff(String name, String address, String school, double pay){
        super(name,address);
        this.school=school;
        this.pay=pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString(){
        return "name-"+super.getName()+"-address-"+super.getAddress()+"-school-"+school+"-pay-"+pay;
    }
}
public class exer2 {
    public static void main(String[]args){
        Person p=new Person("thein","69_tinh_lo_5");
        Student s=new Student("trung","69_tinh_lo_5","IT",3,20.123);
        Staff st=new Staff("trang","69_tinh_lo_5","open_university",2000);
        System.out.println(p);
        System.out.println(s);
        System.out.println(st);
    }
}
