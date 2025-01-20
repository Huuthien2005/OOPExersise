package exer3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> findStudent(ArrayList<Student> firstStu){
        ArrayList<Student> newStu=new ArrayList<Student>();
        for(Student stu:firstStu){
            if(stu.getRank().equals("A")||stu.getRank().equals("Passed"))
                newStu.add(stu);
        }
        return newStu;
    }
    public static <E> boolean writeFile(String path,ArrayList<E> first){
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(path));
            for( int i=0;i<first.size();i++){
                bw.write(first.get(i).toString());
                if(i<first.size())
                    bw.write("\n");
            }
            bw.close();
            return true;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args){
        ArrayList<Student> listStudent=new ArrayList<>();
        listStudent.add(new ITStudent(123,"thien",9));
        listStudent.add(new ITStudent(124,"trung",7));
        listStudent.add(new MathStudent("125","trang",6));
        listStudent.add(new MathStudent("126","huyen", 10));
        Main p1=new Main();
        if(writeFile("D:/Intellij_project/Lab9_2/src/exer3/listStudent.txt",p1.findStudent(listStudent)))
            System.out.println("success!");
        else System.out.println("Failure!");
    }
}
