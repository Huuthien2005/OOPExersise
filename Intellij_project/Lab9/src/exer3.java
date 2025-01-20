import java.io.*;

public class exer3  {
    public static void UpperCaseLetterOne(String inputPath,String outputPath)throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter(outputPath));
        BufferedReader br=new BufferedReader(new FileReader(inputPath));
        String line="";
        while((line=br.readLine())!=null){
            bw.write(line.toUpperCase());
            bw.write("\n");
            System.out.println(line.toUpperCase());
        }

        bw.close();
        br.close();

    }
    public static void main(String[] args){
        String input="D:/Intellij_project/Lab9/src/input.txt";
        String output="D:/Intellij_project/Lab9/src/output.txt";
        try{
            UpperCaseLetterOne(input,output);
        }catch(IOException e){
            System.err.println("Error "+ e.getMessage());
        }
    }
}
