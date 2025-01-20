package exer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Management {
    List<GiangVien> professors=new ArrayList<>();
    final Scanner sc=new Scanner(System.in);
    //them giang vien vao dsach
    public void addProfessor(GiangVien... professor){
        professors.addAll(Arrays.asList(professor));
    }
    public void addProfessor(GiangVien professor){
        professors.add(professor);
    }
    public void addProfessor(){

    }
    //xoa giang vien
    public void removeProfessor(String nameProfessor){
        professors.removeIf(professor-> professor.getTen().equalsIgnoreCase(nameProfessor));
    }
    //tra cuu ttin giang vien theo ten,hoc ham, hoc vi
    public List<GiangVien> searchProfessor(String keyword){
        return professors.stream().filter(professor->
                professor.getTen().equalsIgnoreCase(keyword)
                        ||professor.getHocHam().equalsIgnoreCase(keyword)
                        ||professor.getHocVi().equalsIgnoreCase(keyword))
                .collect(Collectors.toList());
    }
    public void inputHourWork(){
        for(GiangVien gv:professors){
            System.out.println("Enter a number of hour for: "+ gv.getTen());
            double hour=sc.nextDouble();
            gv.setHour(hour);
        }

    }
    public void sortProfessorByDecreasedSalary(){
        List<GiangVien> listTemp=new ArrayList<>(professors);
        listTemp.sort((gv1,gv2)->Double.compare(gv1.getSalary(), gv2.getSalary()));
        System.out.println("Professor list with decreased salary: ");
        for(GiangVien gv: professors){
            gv.display();
            System.out.println("Salary: "+gv.getSalary());
            System.out.println("-----------------------------------");
        }
    }

}
