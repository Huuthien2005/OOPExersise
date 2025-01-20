class Circle_0{
    private double radius;
    private String color;
    public Circle_0(){
        this.radius=1.0;
        this.color="red";
    }
    public Circle_0(double radius){
        this.radius=radius;
        this.color="red";
    }
    public Circle_0( double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(radius,2)*3.14;
    }
    public String toString(){
        return "color-"+color+"-radius-"+radius+"-area-"+getArea();
    }
}
class Cylinder extends Circle_0{
    private double height;
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        this.height=1.0;
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public Cylinder(double radius, double height,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public String toString(){
        return "height-"+height+"-Volume-"+getVolume();
    }
}
public class exer1 {
    public static void main(String[] args){
        Circle_0 c=new Circle_0(3.0,"blue");
        System.out.println(c);
        Cylinder cy=new Cylinder(4.0,2.0,"white");
        System.out.println(cy);
    }
}
