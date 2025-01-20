class Employee{
    private String id;
    private String fullName;
    private int yearJoinded;
    private double coefficientsSalary;
    private int numDaysOff;// number of days off in the month
    private static final int currentYear=2024;
    static final private double basicSalary=1150.0;
    public Employee(){
        this.id="0";
        this.fullName="";
        this.yearJoinded=2020;
        this.coefficientsSalary=1.0;
        this.numDaysOff=0;
    }
    public Employee(String id,String fullName, double coefficientsSalary){
        this.id=id;
        this.fullName=fullName;
        this.yearJoinded=2020;
        this.coefficientsSalary=coefficientsSalary;
        this.numDaysOff=0;
    }
    public Employee(String id,String fullName, double coefficientsSalary,int yearJoined,int numDaysOff){
        this.id=id;
        this.fullName=fullName;
        this.yearJoinded=yearJoined;
        this.coefficientsSalary=coefficientsSalary;
        this.numDaysOff=numDaysOff;
    }
    public String getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getYearJoinded() {
        return yearJoinded;
    }
    public void setYearJoinded(int yearJoinded) {
        this.yearJoinded = yearJoinded;
    }
    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }
    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
    public int getNumDaysOff() {
        return numDaysOff;
    }
    public void setNumDaysOff(int numDaysOff) {
        this.numDaysOff = numDaysOff;
    }

    public static double getBasicSalary() {
        return basicSalary;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public double getSenioritySalary(){
        return (currentYear-yearJoinded+1)>5? (currentYear-yearJoinded+1)*basicSalary/100:0;
    }
    public String considerEmulation(){
        if(numDaysOff<=1)
            return "grade A";
        else if(numDaysOff==2)
            return "grade B";
        else
            return "grade C";
    }
    public double emulationCoefficient(){
        if(considerEmulation().equals("grade A"))
            return 1.0;
        if(considerEmulation().equals("grade B"))
            return 0.75;
        if(considerEmulation().equals("grade C"))
            return 0.5;
        return -1;
    }
    public double getSalary(){
        return basicSalary*coefficientsSalary*emulationCoefficient()+getSenioritySalary();
    }
}
public class exer5 {
    public static void main(String[] args){

    }
}
