package exer3;

import java.util.ArrayList;

public class Main {
    public ArrayList<Student> findStudent(ArrayList<Student> _1stStu){
        ArrayList<Student> StudentPassed=new ArrayList<>();
        for(Student st: _1stStu){
            if(st.getRank().equals("A")|| st.getRank().equals("Passed"))
                StudentPassed.add(st);
        }
        return StudentPassed;
    }
    public static void main(String[] args){
        ArrayList<Student> student=new ArrayList<>();
        student.add(new ITStudent("Nhut",9.37,12345));
        student.add(new MathStudent("HeheBoiz",6.7,"523H0132"));
        student.add(new ITStudent("Nguyen Van A",7.1,43211));
        student.add(new MathStudent("Nguyen Van B",1.7,"123H1234"));

        Main point=new Main();
        for(Student st: point.findStudent(student)){
            System.out.println(st.getsName());
        }
    }
}
