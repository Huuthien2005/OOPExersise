package exer5;

import java.util.Locale;

public class VietnameseTranslator implements NumberTranslator{
    public final String[] numbers={"một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
    public String getString(int number){
        if(number>=0&&number<10){
            return numbers[number];
        }
        return "out of range";
    }

    @Override
    public int getNumber(String str) {
        str=str.toLowerCase();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i].equalsIgnoreCase(str))
            {
                return i;
            }
        }
        return -1;
    }
}
