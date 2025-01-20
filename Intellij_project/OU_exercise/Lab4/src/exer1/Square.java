package exer1;

public class Square extends Rectangle{
    private double edge;
    public Square(String name,double edge){
        super(name,edge,edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
