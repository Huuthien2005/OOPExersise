package exer7;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManagement {
    public static List<Student> list =new ArrayList<>();
    //point 1
    public void inputStudent(Student... stu){
        list.addAll(Arrays.asList(stu));
    }


    // point 2
    public void inputStudentFile(String inputPath) throws IOException, ParseException{
        BufferedReader br=new BufferedReader(new FileReader(inputPath));
        String hoten,ngaySinh,queQuan,line;
        while((line=br.readLine())!=null) {
            String[] info = br.readLine().split(",");
            hoten = info[0].trim();
            queQuan = info[1].trim();
            ngaySinh = info[2].trim();
            System.out.println("ngay sinh doc duoc: " + ngaySinh);
            list.add(new Student(hoten, ngaySinh, queQuan));
        }
        br.close();
    }
    //point7
    public void findStudentHaveScholarship(String outputPath)throws IOException{
        BufferedWriter bw= new BufferedWriter(new FileWriter(outputPath));
        for(Student stu: list){
            if(stu.isScholarship())
                bw.write(stu.getStudentID()+"-"+stu.getName()+"-"+stu.averageScore());
        }
        bw.close();
    }
    //point 3
    public void inputScore(int StudentID,double mathScore,double literatureScore,double englishScore){
        for(Student stu: list){
            if(stu.getStudentID()==StudentID)
            {
                System.out.print("type math score: ");
                mathScore=config.sc.nextDouble();
                System.out.print("type literature score: ");
                literatureScore=config.sc.nextDouble();
                System.out.print("type english score: ");
                englishScore=config.sc.nextDouble();
                stu.setScore(mathScore,literatureScore,englishScore);
                return;
            }
        }
        System.out.println("khong tim thay!");
    }
    //point 8
    public void sumAge(){
        int countAgeunder18=0;
        int countAgeBetween18_23=0;
        int countAgeAbove24=0;
        for(Student stu:list){
            if(stu.elderthan23())
                countAgeAbove24++;
            else if(stu.youngthan18())
                countAgeunder18++;
            else
                countAgeBetween18_23++;
        }
        System.out.println("thong ke do tuoi: ");
        System.out.println("duoi 18: "+countAgeunder18);
        System.out.println("tu 18-23: "+countAgeBetween18_23);
        System.out.println("tren 23: "+countAgeAbove24);
    }
    //point 5
    public void findStudent(String name){
        for(Student stu: list){
            if(stu.getName().equals(name)){
                stu.toString();
                return;
            }
        }
        System.out.println("undefined");
    }
    //point 6
    public ArrayList<Student> sortStudent(){
        ArrayList<Student> sortList=new ArrayList<>();
        while(sortList.size()!=list.size()){
            Student tempStu=new Student();
            for(Student stu:list){
                if(tempStu.averageScore()>stu.averageScore())
                    tempStu=stu;
            }
            sortList.add(tempStu);
        }
        return sortList;
    }
    //point 4
    public void displayStudentList(){
        list.forEach(h -> System.out.println(h.toString()));
    }
}
