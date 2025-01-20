package exer2;

import java.time.LocalDate;

public abstract class GiangVien {
    private String ten;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate startedDate;
    public double hour;
    public static final double hourSalary=90000;
    public GiangVien(String ten,LocalDate ngaySinh,String hocHam,String hocVi,LocalDate startedDate){
        this.ten=ten;
        this.ngaySinh=ngaySinh;
        this.hocHam=hocHam;
        this.hocVi=hocVi;
        this.startedDate=startedDate;
    }
    public abstract double getSalary();
    public void display() {
        System.out.println("ten giang vien: "+ten);
        System.out.println("ngay sinh: "+ngaySinh);
        System.out.println("hoc ham: "+hocHam);
        System.out.println("hoc vi: "+hocVi);
        System.out.println("ngay bat dau: "+startedDate);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }

    public LocalDate getStartedDate() {
        return startedDate;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }
}
