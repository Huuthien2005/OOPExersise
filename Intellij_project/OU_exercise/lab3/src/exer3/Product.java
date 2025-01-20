package exer3;

public class Product {
    private String IDProduct;
    private String name;
    private String describe;
    private String producer;
    private double price;
    public Product(String IDProduct,String name,String describe,String producer,double price){
        this.IDProduct=IDProduct;
        this.name=name;
        this.describe=describe;
        this.producer=producer;
        this.price=price;
    }

    public void display(){
        System.out.println("ID: "+IDProduct);
        System.out.println("name: "+name);
        System.out.println("describe: "+describe);
        System.out.println("manufacturer: "+producer);
        System.out.println("price: "+price);
    }

    public String getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(String IDProduct) {
        this.IDProduct = IDProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
