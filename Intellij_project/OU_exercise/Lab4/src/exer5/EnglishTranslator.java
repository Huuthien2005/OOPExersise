package exer5;

import java.util.Locale;

public class EnglishTranslator implements NumberTranslator{
    private final String[] numbers={"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"};
    public String getString(int number){
        if(number>=0&&number<10){
            return numbers[number];
        }
        return "out of range";
    }
    public int getNumber(String str){
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
