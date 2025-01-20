package exer1;

public class Circle extends Ellipse{
    public Circle(double radius){
        super(radius,radius);
    }

    @Override
    public String toString() {
        return "Circle shape: Area: "+getArea()+"- Perimeter: "+getPerimeter();
    }
}
