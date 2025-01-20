package exer2;

import java.util.ArrayList;

public class Main<T> {
    public static double distancePoint(Point p){
        return Math.sqrt(Math.pow(p.getX(),2)+Math.pow(p.getY(),2));
    }
    public static void main(String[]args){
        ArrayList<Point> a=new ArrayList<>();
        a.add(new Point(1,2));
        a.add(new Point(2,2));
        a.add(new Point(3,2));
        a.add(new Point(-1,2));
        a.add(new Point(0.1,0.2));
        a.add(new Point(-0.1,-0.2));
        a.add(new Point(-0.1,2));
        a.add(new Point(3,-0.3));

        System.out.println("distance of point that calculate between point and O with a radius of 1: ");
        for(Point p:a){
            if(distancePoint(p)<=1){
                System.out.println(p);
            }
        }
    }
}
