package exer2;

import java.time.LocalDate;

public class GiangVienThinhGiang extends GiangVien{
    private String noiCongTac;
    public GiangVienThinhGiang(String ten, LocalDate ngaySinh,String hocHam,String hocVi,LocalDate startedDate,String noiCongTac){
        super(ten,ngaySinh,hocHam,hocVi,startedDate);
        this.noiCongTac=noiCongTac;
    }
    public double getSalary(){
        return super.getHour()*hourSalary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("noi cong tac: "+noiCongTac);
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }
}
