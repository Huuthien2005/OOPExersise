package exer5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        /*Fraction[] fr=new Fraction[]{
                new Fraction(-2, -4),
                new Fraction(3, 4),
                new Fraction(5, 6),
                new Fraction(-4,-5),
                new Fraction(-2,-3)
        };
        //xuat cac phan so trong mang
        int count=0;
        for(Fraction fraction:fr){
            *//*System.out.println(fraction.toString());*//*
            System.out.print("phan tu thu "+ ++count+": ");
            fraction.display();
        }
        //tinh tong phan so trong mang
        Fraction sumFraction=new Fraction(0,1);
        for(Fraction fraction:fr){
            sumFraction=sumFraction.plus(fraction);
        }
        *//*System.out.println(sumFraction.toString());*//*
        System.out.print("tong cac phan so la: ");
        sumFraction.display();
        //find max
        Fraction max=new Fraction();
        for(Fraction fraction:fr){
            fraction.findMAx(max);
        }
        System.out.print("phan so lon nhat la: ");
        max.display();*/
        FractionList danhSach = new FractionList();

        // Thêm phân số vào danh sách
        danhSach.addFraction(new Fraction(1, 2));
        danhSach.addFraction(new Fraction(3, 4));
        danhSach.addFraction(new Fraction(5, 6));

        // Hiển thị danh sách phân số
        System.out.println("Danh sách phân số:");
        danhSach.display();

        // Tính tổng các phân số
        Fraction tong = danhSach.sumFractionList();
        System.out.println("Tổng các phân số: " + tong);

        // Tìm phân số lớn nhất và nhỏ nhất
        Fraction lonNhat = danhSach.findMaxList();
        Fraction nhoNhat = danhSach.findMinList();
        System.out.println("Phân số lớn nhất: " + lonNhat);
        System.out.println("Phân số nhỏ nhất: " + nhoNhat);

        // Sắp xếp danh sách phân số theo thứ tự tăng dần
        /*danhSach.arrangeList();
        System.out.println("Danh sách phân số sau khi sắp xếp tăng dần:");
        danhSach.display();*/

        // Xóa phân số
        Fraction fr=new Fraction(1,2);
        danhSach.removeElement(fr);
        System.out.println("Danh sách sau khi xóa phân số 1/2:");
        danhSach.display();
    }
}
