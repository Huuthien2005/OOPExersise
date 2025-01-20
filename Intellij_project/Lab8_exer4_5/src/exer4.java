import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class exer4 {
        public static Vector<Long> calculate(Vector<Long> X){
            Vector<Long> y=new Vector<Long>();
            for( Long x:X){
                y.add(2L*x*x+1);
            }
            return y;
        }
        public static void main(String[]args){
            Vector<Long> X=new Vector<>();
            Scanner sc=new Scanner(System.in);
            Random random=new Random();
            int n=0;
            System.out.print("nhap so phan tu: ");
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                Long value=random.nextLong(10);
                X.add(value);
                System.out.println(value);
            }
            sc.close();
            Vector<Long> Y=calculate(X);
            System.out.println(Y);
        }
    }
