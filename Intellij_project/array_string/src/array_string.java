import java.util.Arrays;
import java.util.Scanner;



public class array_string {
    // hàm main
    public static void main(String[] args){
        /*int[] arr=new int[]{1,3,1,3,2,4};
        find_duplicated_value(arr);*/
        /*int[][] arr=new int[2][2];
        input_matrices(arr);
        output_matrices(arr);
        mutiply_number(arr,2);
        output_matrices(arr);*/
    }
    //tìm gia trị bị lặp lại
    public static void find_duplicated_value(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
                System.out.print(arr[i]+ " ");
        }
    }
    //hàm nhập mang 2 chiều
    public static void input_matrices(int[][] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap mang: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("nhap vao gia tri ["+i+"]["+j+"]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    //xuất mảng 2 chiều
    public static void output_matrices(int[][] arr){
        System.out.println("output: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //hàm nhân mang 2 chiều với 1 số
    public static void mutiply_number(int [][] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]*=k;
            }
        }
    }
}
