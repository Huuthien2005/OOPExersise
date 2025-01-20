class Point2D{
    private float x;
    private float y;
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] setXY(){
        return new float[]{x,y};
    }
    public void getXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Point2D: {x,y}: {"+x+","+y+"}";
    }
}
class Point3D extends Point2D{
    private float z;
    public Point3D(){
        super();
        this.z=0.0f;
    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }
    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public String toString(){
        return "Point3D: {x,y,x}: {"+super.getX()+","+super.getY()+","+z+"}";
    }
}
public class exer3 {
    public static void main(String[] args){
        Point2D point2d =new Point2D(2.0f,3.0f);
        Point3D point3d=new Point3D(4.0f,5.0f,6.0f);
        System.out.println(point2d);
        System.out.println(point3d);
    }
}
