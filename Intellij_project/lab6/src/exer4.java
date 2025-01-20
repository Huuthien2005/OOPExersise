class Shape{
    private String color;
    private boolean filled;
    public Shape(){
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "color: "+color+" - filled: "+filled;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        this.radius=1.0;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*3.14;
    }
    public double getPerimeter(){
        return radius*2*3.14;
    }
    public String toString(){
        return "shape: color-"+super.getColor()+" - filled-"+super.isFilled()+" - radius-"+radius+" - area-"+getArea();
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        super();
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width,double length){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return "Shape: - color: "+super.getColor()+" - filled: "+super.isFilled()+" - width: "+width+" - length: "+length;
    }
}
class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){
        super.setWidth(width);
    }
    public void setLength(double length){
        super.setLength(length);
    }
    public String toString(){
        return "Shape: - color: "+super.getColor()+" - filled: "+super.isFilled()+" - width-length: "+super.getWidth()+" - area: "+super.getArea()+" - perimeter: "+super.getPerimeter();
    }
}
public class exer4 {
    public static void main(String[] args){
        Shape shape=new Shape("blue", true);
        Rectangle rectangle=new Rectangle(2.0,3.0,"white",true);
        Square square=new Square(4.0,"black",true);
        Circle circle=new Circle(5.0,"green",true);
        System.out.println(shape);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);
    }
}
