package exer3;

import java.util.ArrayList;
import java.util.List;

public class ProductList{
    List<Product> productList=new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(String id){
       productList.removeIf(product ->product.getIDProduct().equalsIgnoreCase(id));
    }

    public void display() {
        for(Product pro:productList){
            pro.display();
        }
    }
    public void searchByKeyword(String keyword){
        for(Product product:productList){
            if(product instanceof Book pr) {
                if (pr.getIDProduct().equalsIgnoreCase(keyword) || pr.getName().equalsIgnoreCase(keyword)) {
                    pr.display();
                    return;
                }
            }
            if(product instanceof CD pr){
                if (pr.getIDProduct().equalsIgnoreCase(keyword) || pr.getName().equalsIgnoreCase(keyword)) {
                    pr.display();
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
    public void searchByPrice(double price){
        for(Product product:productList){
            if(product instanceof Book pr){
                if(pr.getPrice()==price){
                    pr.display();
                    return;
                }
            }
            if(product instanceof CD pr){
                if(pr.getPrice()==price){
                    pr.display();
                    return;
                }
            }
        }
    }
    public void updateProduct(String ID,String name,String describe,String producer,double price){
        for(Product pro:productList){
            if(pro.getIDProduct().equalsIgnoreCase(ID)){
                if(pro.getName()!=null)
                    pro.setName(name);
                if(pro.getDescribe()!=null)
                    pro.setDescribe(describe);
                if(pro.getProducer()!=null)
                    pro.setProducer(producer);
                if(pro.getPrice()>0)
                    pro.setPrice(price);
                return;
            }
        }
        System.out.println("Not Found");
    }
    public void sortProductsByPrice(){
        productList.sort((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
    }
}
