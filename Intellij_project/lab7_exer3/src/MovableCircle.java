public class MovableCircle extends MovablePoint implements Movable{
    int radius;
    MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        super(x,y,xSpeed,ySpeed);
        this.radius=radius;
        center=new MovablePoint(x,y,xSpeed,ySpeed);
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }
    @Override
    public void moveUp() {
        center.y+= center.ySpeed;
    }
    @Override
    public void moveDown() {
        center.y-=center.ySpeed;
    }
    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }
}
