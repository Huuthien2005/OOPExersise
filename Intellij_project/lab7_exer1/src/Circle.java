public class Circle extends Shape {
    private double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*3.14;
    }
    public double getPerimeter(){
        return 2*radius*3.14;
    }
    public String toString(){
        return "Shape: {color: "+getColor()+", filled: "+isFilled()+", radius: "+radius+", area: "+getArea()+", perimeter: "+getPerimeter();
    }
}