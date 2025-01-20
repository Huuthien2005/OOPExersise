import java.io.*;
import java.lang.reflect.Array;

public class exer5 {
    public static void calculate(String inputPath,String outputPath) throws IOException{
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(outputPath));
            BufferedReader br=new BufferedReader(new FileReader(inputPath));
            String line="";
            int sum=0;
            while((line=br.readLine())!=null){
                String[] nums=line.split("\\s+");
                for(String num:nums){
                    sum+=Integer.parseInt(num);
                }
            }
            bw.write(String.valueOf(sum));
            br.close();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        try{
            String inputPath="D:\\Intellij_project\\Lab9_2\\src\\input.txt";
            String ouputPath="D:\\Intellij_project\\Lab9_2\\src\\output.txt";
            calculate(inputPath,ouputPath);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
