package exer1;

import java.awt.geom.Area;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    Triangle(String name, double a,double b,double c){
        super(name);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getHalfPerimeter(){
        return (a+b+c)/2;
    }
    @Override
    public double getArea() {
        return Math.sqrt(getHalfPerimeter()*(getHalfPerimeter()-a)*(getHalfPerimeter()-b)*(getHalfPerimeter()-c));
    }

    @Override
    public double getPerimeter() {
        return getHalfPerimeter()*2;
    }

    @Override
    public String toString() {
        return "shape: name: "+getName()+"- edge a: "+a+"- edge b: "+b+"- edge c: "+c+"- Area: "+ getArea()+"- perimeter: "+getPerimeter();
    }
}
