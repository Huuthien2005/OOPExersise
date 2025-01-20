package exer3;

public class CD extends Product{
    private double length;
    public CD(String IDProduct,String name,String describe,String producer,double price, double length){
        super(IDProduct,name,describe,producer,price);
        this.length=length;
    }
    public void display(){
        super.display();
        System.out.println("length of CD: "+length);
    }
}
