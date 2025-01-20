package exer1;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Shape h1 = new Rectangle("AAA", 20,10 );
        Shape h2 = new Triangle("BBB", 10, 5,7 );
        Shape h3 = new IsoscelesTriangle("BBB", 5,8 );
        Shape h4 = new EquilateralTriangle("BBB",6 );
        Shape h5 = new Ellipse("CCC", 5,3 );
        Shape h6 = new Square("AAA",10 );
        Shape h7 = new IsoscelesTriangle("DDD", 8,10 );

        ShapeList q1 = new ShapeList();
        q1.addShape(h1,h2,h3,h4,h5,h6,h7);

        System.out.println("a)================");
        q1.display();
        System.out.println("b)================");
        q1.search("exercise1.TamGiacCan").forEach(h -> System.out.println(h));
        System.out.println("c)================");
        q1.sortDecreasedArea();
        q1.display();
        System.out.println("d)================");
        q1.sortName();
        q1.display();
        System.out.println("e)================");
        System.out.println(q1.averageAreaList());
        System.out.println("f)================");
        System.out.println(q1.SearchShape(h1));
    }
}
