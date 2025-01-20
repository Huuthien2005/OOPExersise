package exer2;

public class Point {
    private double x;
    private double y;
    public Point(){
        this.x=0.0;
        this.y=0.0;
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString() {
        return "Point: {x,y}: {"+x+","+y+"}";
    }
}
