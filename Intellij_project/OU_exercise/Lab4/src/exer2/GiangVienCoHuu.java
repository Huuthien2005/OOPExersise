package exer2;

import java.time.LocalDate;

public class GiangVienCoHuu extends GiangVien{
    private double luongCoBan;
    private double heSoLuong;
    public GiangVienCoHuu(String ten, LocalDate ngaySinh, String hocHam,String hocVi,LocalDate startedDate,double luongCoBan,double heSoLuong){
        super(ten,ngaySinh,hocHam,hocVi,startedDate);
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
    }

    @Override
    public double getSalary() {
        return super.getHour()*hourSalary+luongCoBan*heSoLuong;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("luong co ban: "+luongCoBan);
        System.out.println("he so luong: "+heSoLuong);
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
