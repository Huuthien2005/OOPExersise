package exer1;

public class Rectangle extends Shape{
    private double length;
    private double wide;
    public Rectangle(String name, double length, double wide){
        super(name);
        this.length=length;
        this.wide=wide;
    }
    public double getArea(){
        return wide*length;
    }
    public double getPerimeter(){
        return 2*(wide+length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "Shape: name-"+getName()+"-length: "+length+"-wide: "+wide+"-Area: "+getArea()+"- perimeter: "+getPerimeter();
    }
}
