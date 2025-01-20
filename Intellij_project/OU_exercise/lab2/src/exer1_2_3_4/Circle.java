package exer1_2_3_4;

public class Circle extends Diem{
    private Diem d;
    private double radius;

    public Diem getD() {
        return d;
    }

    public void setD(Diem d) {
        this.d = d;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public String distancePoint(Diem d1){
        if(radius==super.calculateDistance(d1))
            return "diem tiep xuc duong tron";
        else if(radius<= super.calculateDistance(d1))
            return "diem cat duong tron, co khoang cach: "+ super.calculateDistance(d1);
        else return "diem kh giao duong tron, co khoang cach: "+super.calculateDistance(d1);
    }
    public String distance2Circle(Circle c1){
        if(Math.abs(this.radius-c1.radius)<super.calculateDistance(c1.d)&&(this.radius+c1.radius)>super.calculateDistance(c1.d))
            return "2 duong tron giao nhau";
        else if(Math.abs(this.radius-c1.radius)==super.calculateDistance(c1.d))
            return "2 duong tron giao trong";
        else if((this.radius+c1.radius)==super.calculateDistance(c1.d))
            return "2 duong tron giao ngoai";
        else if((this.radius+c1.radius)>super.calculateDistance(c1.d))
            return "2 duong tron khong giao nhau";
        else return " 1 duong tron la con duong tron kia";
    }
    public String toString(Diem d1,Circle c1){
        return "[("+d.getX()+","+d.getY()+")] - "+getRadius()+"-"+getArea()+"-"+getPerimeter()+"-"+distancePoint(d1)+"-"+distance2Circle(c1);
    }
    public static void main(String[] args){
        Circle c=new Circle();
        Circle c1=new Circle();
        Diem d=new Diem(3,4);
        Diem d1=new Diem(2,3);
        c.setD(d);
        c.setRadius(5);
        c1.setRadius(7);
        c1.setD(d1);
        System.out.println(c.toString(d1,c1));

    }
}
