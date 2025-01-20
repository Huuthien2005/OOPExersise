import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class exer5 {
    public static boolean checkWord(HashMap<String,String> dictionary, String word){
        return dictionary.containsKey(word);
    }
    public static String findWord(HashMap<String,String> dictionary, String word){
        return (dictionary.containsKey(word)) ? word+": "+dictionary.get(word) : word+": not contain in dictionary.";
    }
    public static void main(String[] args){
        HashMap<String,String> dictionary = new HashMap<>(10);
        dictionary.put("hello","Xin chào");
        dictionary.put("goodbye","Tạm biệt");
        dictionary.put("thank you","Cảm ơn");
        dictionary.put("please","Xin vui lòng");
        dictionary.put("sorry","Xin lỗi");
        dictionary.put("yes","Có");
        dictionary.put("no","Không");
        dictionary.put("help","Giúp đỡ");
        dictionary.put("eat","Ăn");
        dictionary.put("drink","Uống");
        System.out.println("Enter a word:");
        String word = "hello";
        System.out.println(findWord(dictionary,word));
        System.out.println("Enter a word:");
        word = "goodbye";
        System.out.println(findWord(dictionary,word));
        System.out.println("Enter a word:");
        word = "morning";
        System.out.println(findWord(dictionary, word));

    }
}
