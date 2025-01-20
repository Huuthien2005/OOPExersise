package exer3;

public class Book extends Product {
    private int page;
    public Book(String IDProduct,String name, String describe,String producer,double price,int page){
        super(IDProduct,name,describe,producer,price);
        this.page=page;
    }
    public void display(){
        super.display();
        System.out.println("a number of page: "+page);
    }
}
