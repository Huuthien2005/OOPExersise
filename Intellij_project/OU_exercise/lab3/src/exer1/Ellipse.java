package exer1;

public class Ellipse {
    private double bigRadius;
    private double smallRadius;
    public Ellipse(double bigRadius,double smallRadius){
        this.bigRadius=bigRadius;
        this.smallRadius=smallRadius;
    }
    public double getArea(){
        return Math.PI*bigRadius*smallRadius;
    }
    public double getPerimeter(){
        return 2*Math.PI*Math.sqrt((Math.pow(bigRadius,2)+Math.pow(smallRadius,2))/2);
    }

    public void setBigRadius(double bigRadius) {
        this.bigRadius = bigRadius;
    }

    public double getBigRadius() {
        return bigRadius;
    }

    public double getSmallRadius() {
        return smallRadius;
    }

    public void setSmallRadius(double smallRadius) {
        this.smallRadius = smallRadius;
    }

    @Override
    public String toString() {
        return "Ellipse shape: Area: "+getArea()+"- Perimeter: "+getPerimeter();
    }
}
