package exer2;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh){
        super(canh,canh);
    }

    @Override
    public String toString() {
        return "hinh vuong: Area:  "+getArea()+"- Perimeter: "+getPerimeter();
    }
}
