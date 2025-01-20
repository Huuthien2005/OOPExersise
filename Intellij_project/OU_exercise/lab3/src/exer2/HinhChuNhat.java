package exer2;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(double dai,double rong){
        this.chieuDai=dai;
        this.chieuRong=rong;
    }
    public double getArea(){
        return chieuDai*chieuRong;
    }
    public double getPerimeter(){
        return 2*(chieuDai+chieuRong);
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "hinh chu nhat: Area: "+getArea()+"- Perimeter: "+getPerimeter();
    }
}
