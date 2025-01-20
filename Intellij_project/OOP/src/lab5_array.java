import java.util.Scanner;

public class lab5_array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of elements of array: ");
        int n = scanner.nextInt();
        System.out.println("Input elements:");
        int[]a = input(n);
        scanner.close();
        System.out.println("Max even: " + maxEven(a));
        System.out.println("Min odd: " + minOdd(a));
        System.out.println("Sum MEMO:" + sumMEMO(a));
        System.out.println("Sum Even: "+ sumEven(a));
        System.out.println("Product odd: "+proOdd(a));
        System.out.println("First index of even number: "+idxFirstEven(a));
        System.out.println("Last index of odd number: "+idxLastOdd(a));
    }
    public static int maxEven(int[]a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]&&a[i]%2==0)
                max=a[i];
        }
        return max;
    }
    public static int minOdd(int[]a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]%2!=0&&min>a[i])
                min=a[i];
        }
        return min;
    }
    public static int sumMEMO(int[]a){
        return maxEven(a)+minOdd(a);
    }
    public static boolean even(int n){
        return n%2==0;
    }
    public static int sumEven(int[]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(even(a[i]))
                sum+=a[i];
        }
        return sum;
    }
    public static int proOdd(int[]a){
        int count=1;
        for(int i=0;i<a.length;i++){
            if(!even(a[i]))
                count*=a[i];
        }
        return count;
    }
    public static int idxFirstEven(int[]a){
        for(int i=0;i<a.length;i++){
            if(even(a[i]))
                return a[i];
        }
        return -1;
    }
    public static int idxLastOdd(int[]a){
        int idxLast=-1;
        for(int i=0;i<a.length;i++){
            if(!even(a[i]))
                idxLast=a[i];
        }
        return idxLast;
    }
    public static int[] input(int n){
        int[]a=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        return a;
    }
}
