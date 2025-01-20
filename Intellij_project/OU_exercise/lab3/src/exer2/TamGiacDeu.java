package exer2;

public class TamGiacDeu extends TamGiac{
    public TamGiacDeu(double abc){
        super(abc,abc,abc);
    }

    @Override
    public String toString() {
        return "Tam giac deu: Area: "+getArea()+"- Perimeter: "+getPerimeter();
    }
}
