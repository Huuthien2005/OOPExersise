package exer1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ShapeList {
    List<Shape> shapes=new ArrayList<>();
    final Scanner sc=new Scanner(System.in);
    //them hinh vao dsach
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public void addShape(Shape... shape){
        shapes.addAll(Arrays.asList(shape));
    }
    public void addShape(){
        System.out.println("Enter name shape: ");
        String name=sc.nextLine();
        Shape shape=null;
        switch(name){
            case "Rectangle":
                System.out.println("Enter length: ");
                double length=sc.nextDouble();
                System.out.println("Enter wide: ");
                double wide=sc.nextDouble();
                shape=new Rectangle(name,length,wide);
                break;
            case "Square":
                System.out.println("Enter edge: ");
                double edge=sc.nextDouble();
                shape=new Square(name,edge);
                break;
            case "Ellipse":
                System.out.println("Enter big radius: ");
                double bigRadius=sc.nextDouble();
                System.out.println("Enter small radius: ");
                double smallRadius=sc.nextDouble();
                shape=new Ellipse(name,bigRadius,smallRadius);
                break;
            case "Circle":
                System.out.println("Enter radius: ");
                double radius=sc.nextDouble();
                shape=new Circle(name,radius);
                break;
            case "Triangle":
                System.out.println("Enter edge A: ");
                double a=sc.nextDouble();
                System.out.println("Enter edge B: ");
                double b=sc.nextDouble();
                System.out.println("Enter edge C: ");
                double c=sc.nextDouble();
                shape=new Triangle(name,a,b,c);
                break;
            case "IsoscelesTriangle":
                System.out.println("Enter Edge(equal): ");
                double ab=sc.nextDouble();
                System.out.println("Enter Edge(remain): ");
                double c1= sc.nextDouble();
                shape=new IsoscelesTriangle(name,ab,c1);
                break;
            case "EquilateralTriangle":
                System.out.println("Enter edge: " );
                double abc=sc.nextDouble();
                shape=new EquilateralTriangle(name,abc);
                break;
            default:
                System.out.println("Not Found!");
                break;
        }
    }
    //remove shape
    public void removeShape(String name){
       shapes.removeIf(shape -> shape.getName().equalsIgnoreCase(name));
    }
    // hien thi thong tin cac hinh trong dsach
    public void display(){
        /*for(Shape shape: shapes){
            shape.toString();
        }*/
        shapes.forEach(shape -> System.out.println(shape));
    }
    // tinh dien tich trung binh trong dsach
    public double averageAreaList(){
        double sumArea=0;
        for(Shape shape: shapes){
            sumArea+=shape.getArea();
        }
        return sumArea/shapes.size();
    }
    // get particular shape type
    public List<Shape> search(String name) throws ClassNotFoundException{
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("class name must not be null or empty");
        }

        Class c=Class.forName(name);
        return shapes.stream().filter(shape -> c.equals(shape.getClass())).collect(Collectors.toList());
        /*Class<ShapeList> targetClass = Class.forName(name);
        return shapes.stream()
                .filter(shape -> targetClass.isAssignableFrom(shape.getClass()))
                .collect(Collectors.toList());*/
    }
    public void sortDecreasedArea(){
        shapes.sort(Comparator.comparing(Shape::getArea).reversed());
    }
    public void sortName(){
        shapes.sort(Comparator.comparing(Shape::getName).thenComparing(Shape::getArea).reversed());
    }
    // bo sung vao ham vao lop(y cuooi)
    public int SearchShape(Shape s){
        return shapes.indexOf(s);
    }
}
