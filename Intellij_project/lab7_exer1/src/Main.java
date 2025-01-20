public class Main {
    public static void main(String[]args){
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Circle(4, "Blue" , false);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(8,12, "Blue", true );
        for(Shape i:shapes){
            System.out.print(i.getArea());
            System.out.print(" ");
        }
        System.out.println();
        for(Shape i:shapes){
            System.out.println(i.toString());
            System.out.println();
        }
        System.out.println();
        //find max area
        double max=shapes[0].getArea();
        for(Shape i:shapes){
            if(max<i.getArea()){
                max=i.getArea();
            }
        }
        System.out.println(max);
        System.out.println();
        System.out.println("comparing 2 first shape ");
        if(shapes[0].getArea()==shapes[1].getArea()){
            System.out.println("shape 1 and 2 is equal");
        }
        else System.out.println("Not equals");
    }
}
