public class String_2 {
    public static int countWord(String paragraph){
        String[] words=paragraph.split("\\s+");
        return words.length;
    }
    public static int countSentences(String paragraph){
        int count=0;
        for(int i=0;i<paragraph.length();i++){
            if(paragraph.charAt(i)=='.'){
                count++;
            }
        }
        return count;
    }
    public static int countAppear(String paragraph, String word){
        int count=0;
        String[] words=paragraph.split("\\s+");
        for(String i: words){
            if(i.equals(word))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        String word="and";
        System.out.println("number of words in paragraph: "+countWord(paragraph));
        System.out.println("number of sentences in paragraph: "+countSentences(paragraph));
        System.out.println("number of "+word+" appear in paragraph: "+countAppear(paragraph,word));
    }
}
