package exer2;

public class Main {
    public static void main(String[] args){
        HinhChuNhat hcn=new HinhChuNhat(5,6);
        HinhVuong hv=new HinhVuong(5);
        TamGiac tg=new TamGiac(2,4,6);
        TamGiacCan tgc=new TamGiacCan(4,5);
        TamGiacDeu tgd=new TamGiacDeu(6);
        System.out.println(hcn.toString());
        System.out.println(hv.toString());
        System.out.println(tg.toString());
        System.out.println(tgc.toString());
        System.out.println(tgd.toString());
    }
}
