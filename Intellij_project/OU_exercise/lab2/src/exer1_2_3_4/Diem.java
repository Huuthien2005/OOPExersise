package exer1_2_3_4;

public class Diem {
    private int x;
    private int y;
    public Diem(){
        this.x=0;
        this.y=0;
    }
    public Diem(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double calculateDistance(Diem d){
        return Math.sqrt(Math.pow(x-d.x,2)+Math.pow(y-d.y,2));
    }
    public double calculateDistance(int x,int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    @Override
    public String toString() {
        return "[("+x+","+y+")]";
    }
}
