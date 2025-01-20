package exer7;

import java.io.BufferedReader;
import java.time.LocalDate;

public class Student {
    private static int count=0;
    private int StudentID;
    {
        count++;
        this.StudentID=count;
    }
    private String name;
    private LocalDate birthdayDate;
    private String hometown;
    private double math;
    private double english;
    private double literature;
    public Student(){
        this.name="";
        this.birthdayDate=null;
        this.hometown="";
        this.math= 0.0;
        this.literature=0.0;
        this.english=0.0;
    }
    public Student(String name,String hometown,LocalDate birthdayDate){
        this.name=name;
        this.birthdayDate=birthdayDate;
        this.hometown=hometown;
        this.math= 0.0;
        this.literature=0.0;
        this.english=0.0;
    }
    public Student(String name,String hometown,String birthdate){
        this(name,hometown,LocalDate.parse(birthdate,config.FORMATTER));
    }
    public void setScore(double math,double literature,double english){
        this.math=math;
        this.literature=literature;
        this.english=english;
    }
    public boolean youngthan18(){
        return this.birthdayDate.plusYears(18).compareTo(LocalDate.now())<0;
    }
    public boolean StudentAgeBetween18_23(){
        return this.birthdayDate.plusYears(23).compareTo(LocalDate.now())<0&&this.birthdayDate.plusYears(18).compareTo(LocalDate.now())>0;
    }
    public boolean elderthan23(){
        return this.birthdayDate.plusYears(23).compareTo(LocalDate.now())>0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }
    public double averageScore(){
        return (math+literature+english)/3.0;
    }
    public boolean isScholarship(){
        return averageScore()>8&&math>5&&literature>5&&english>5? true:false;
    }

    @Override
    public String toString() {
        String birthdateStr=config.FORMATTER.format(birthdayDate);
        return "studentID: "+StudentID+"-name: "+name+"- birthdate: "+birthdateStr+"- hometown: "+hometown+"- math score: "+math+"- literature score: "+literature+"- english score: "+english;
    }
}
