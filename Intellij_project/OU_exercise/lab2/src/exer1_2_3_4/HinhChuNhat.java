package exer1_2_3_4;

public class HinhChuNhat{
    private int DTTx;
    private int DTTy;
    private int DDPx;
    private int DDPy;
    public HinhChuNhat(){
        this.DTTx=0;
        this.DTTy=0;
        this.DDPx=0;
        this.DDPy=0;
    }
    public HinhChuNhat(int DTTx,int DTTy,int DDPx,int DDPy){
        this.DTTx=DTTx;
        this.DTTy=DTTy;
        this.DDPx=DDPx;
        this.DDPy=DDPy;
    }

    public int getDTTx() {
        return DTTx;
    }
    public void setDTTx(int DTTx) {
        this.DTTx = DTTx;
    }
    public void setDDPx(int DDPx) {
        this.DDPx = DDPx;
    }

    public int getDTTy() {
        return DTTy;
    }

    public void setDTTy(int DTTy) {
        this.DTTy = DTTy;
    }

    public int getDDPx() {
        return DDPx;
    }

    public int getDDPy() {
        return DDPy;
    }

    public void setDDPy(int DDPy) {
        this.DDPy = DDPy;
    }
    public double getWide(){
        return Math.sqrt(Math.pow(DDPy-DTTy,2));
    }
    public double getLength(){
        return Math.sqrt(Math.pow(DDPx-DTTx,2));
    }
    public double getPerimeter(){
        return 2*(getLength()+getWide());
    }
    public double getArea(){
        return getLength()*getWide();
    }
    public String toString(){
        return "diem tren trai: ("+DTTx+","+DTTy+") diem duoi phai: ("+DDPx+","+DDPy+") perimeter: "+getPerimeter()+" Area: "+getArea();
    }
    public static void main(String[] args){
        HinhChuNhat hcn=new HinhChuNhat(2,1,-1,3);
        System.out.println(hcn.toString());
    }
}
