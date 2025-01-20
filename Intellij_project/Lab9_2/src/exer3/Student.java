package exer3;

public abstract class Student {
    private String sName;
    private double gpa;
    public Student(){
    }
    public Student(String sName,double gpa){
        this.sName=sName;
        this.gpa=gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsName() {
        return sName;
    }

    public abstract String getRank();
    public abstract String toString();
}
