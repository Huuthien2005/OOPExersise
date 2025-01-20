package exer1_2_3_4;

public class DoanThang {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public DoanThang(){
        this.x1=0;
        this.y1=0;
        this.x2=0;
        this.y2=0;
    }
    public DoanThang(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "[("+x1+","+y1+"),("+x2+","+y2+")]";
    }
    public double distance(){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
    public String centrePoint(){
        return "[("+(x1+x2)/2+","+(y1+y2)/2+")]";
    }
    public boolean checkParalel(DoanThang d){
        return (x1-x2)/(y1-y2)==(d.x1-d.x2)/(d.y1-d.y2);
    }
    /*public static void main(String[] args){
        DoanThang d=new DoanThang(-1,-2,3,2);
        DoanThang d1=new DoanThang(2,1,2,3);
        System.out.println(d.toString());
        System.out.println(d.distance());
        System.out.println(d.centrePoint());
        System.out.println(d.checkParalel(d1));
    }*/
}

