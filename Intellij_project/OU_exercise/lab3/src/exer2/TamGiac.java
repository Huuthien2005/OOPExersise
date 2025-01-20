package exer2;

public class TamGiac {
    private double a;
    private double b;
    private double c;
    public TamGiac(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static double getHalfPerimeter(double a,double b,double c){
        return (a+b+c)/2;
    }
    public double getArea(){
        return Math.sqrt(getHalfPerimeter(a,b,c)*(getHalfPerimeter(a,b,c)-a)*(getHalfPerimeter(a,b,c)-b)*(getHalfPerimeter(a,b,c)-c));
    }
    public double getPerimeter(){
        return getHalfPerimeter(a,b,c)*2;
    }

    @Override
    public String toString() {
        return "Tam giac: Area: "+getArea()+"- Perimeter: "+getPerimeter();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
