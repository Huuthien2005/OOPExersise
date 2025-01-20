package exer_4;

public class Circle implements GeometricObject {
    protected double radius;
    public Circle(){
    }
    /*public Circle(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }*/
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}
