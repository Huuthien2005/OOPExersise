package exer1;

public class Ellipse extends Shape{
    private double bigRadius;
    private double smallRadius;
    Ellipse(String name,double big,double small){
        super(name);
        this.bigRadius=big;
        this.smallRadius=small;
    }

    @Override
    public double getArea() {
        return Math.PI* bigRadius*smallRadius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*Math.sqrt((Math.pow(bigRadius,2)+Math.pow(smallRadius,2))/2);
    }

    @Override
    public String toString() {
        return "shape: name: "+getName()+"-Big radius: "+bigRadius+"- small radius: "+smallRadius+"- Area: "+getArea()+"- perimeter: "+getPerimeter();
    }

    public double getSmallRadius() {
        return smallRadius;
    }

    public void setSmallRadius(double smallRadius) {
        this.smallRadius = smallRadius;
    }

    public double getBigRadius() {
        return bigRadius;
    }

    public void setBigRadius(double bigRadius) {
        this.bigRadius = bigRadius;
    }
}
