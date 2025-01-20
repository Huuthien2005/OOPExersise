package exer_4;

public class ResizableCircle extends Circle implements Resizable  {
    public ResizableCircle(){
        super();
    }
    public void resize(int percent){
        this.radius=radius*percent/100;
    }
}
