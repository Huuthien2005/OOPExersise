package exer3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ProductList products=new ProductList();
        int chosen;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("\t\t\t\t\t\t\t\t\tMENU\t\t\t\t");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm, các phương thức cho phép truyền vào đối tượng sản phẩm hoặc chỉ là mã sản phẩm để xóa");
            System.out.println("3. Cập nhật sản phẩm tên sản phẩm, mô tả sản phẩm hoặc giá sản phẩm dựa trn mã sản phẩm");
            System.out.println("4. tìm kiếm sản phẩm theo mã sản phẩm, tên sản phẩm hoặc khoảng giá bán");
            System.out.println("5. Sắp xếp các sản phẩm giảm dần theo giá");
            System.out.println("6. Xem danh sách sản phẩm");
            System.out.println("7. Thoát  chương trình");
            System.out.print("nhap lua chon: ");
            chosen=sc.nextInt();
            sc.nextLine();
            switch (chosen){
                case 1:
                    System.out.print("nhap kieu san pham(book/CD): ");
                    String type=sc.nextLine();
                    System.out.print("nhap ma san pham: ");
                    String IDProduct=sc.nextLine();
                    System.out.print("nhap ten san pham: ");
                    String name=sc.nextLine();
                    System.out.print("nhap mo ta san pham: ");
                    String Describe=sc.nextLine();
                    System.out.print("nhap nha san xuat: ");
                    String producer=sc.nextLine();
                    System.out.print("nhap gia ban: ");
                    double price=sc.nextDouble();
                    if(type.equalsIgnoreCase("book")){
                        System.out.print("nhap so trang: ");
                        int pageCount=sc.nextInt();
                        products.addProduct(new Book(IDProduct,name,Describe,producer,price,pageCount));
                    }
                    else if(type.equalsIgnoreCase("CD")){
                        System.out.print("nhap thoi luong cua CD: ");
                        double length=sc.nextDouble();
                        products.addProduct(new CD(IDProduct,name,Describe,producer,price,length));
                    }
                    else System.out.println("san pham khong hop le: ");
                    break;
                case 2:
                    System.out.print("nhap ma san pham can xoa: ");
                    String id=sc.nextLine();
                    products.removeProduct(id);
                    System.out.println("danh sach sau khi thay doi: ");
                    products.display();
                    break;
                case 3:
                    System.out.print("nhap san pham muon thay doi: ");
                    String ID=sc.nextLine();
                    System.out.print("nhap ten muon thay doi: ");
                    String name1=sc.nextLine();
                    System.out.print("nhap mo ta san pham muon thay doi: ");
                    String describe=sc.nextLine();
                    System.out.print("nhap nha san xuat muon thay doi: ");
                    String producer1=sc.nextLine();
                    System.out.print("nhap gia san pham muon thay doi: ");
                    double price1=sc.nextDouble();
                    products.updateProduct(ID,name1,describe,producer1,price1);
                    break;
                case 4:
                    System.out.print("nhap ma san pham, ten san pham hoac gia ban: ");
                    String keyword=sc.nextLine();
                    products.searchByKeyword(keyword);
                    break;

                case 5:
                    products.sortProductsByPrice();
                    System.out.println("danh sach sau khi sap xep la: ");
                    products.display();
                    break;
                case 6:
                    products.display();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        }while(chosen!=7);
        sc.close();
    }
}
