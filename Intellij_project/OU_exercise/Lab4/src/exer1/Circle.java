package exer1;

public class Circle extends Ellipse{
    private double radius;
    public Circle(String name,double radius){
        super(name,radius,radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
