public class String_1 {
    // tạo tên ngắn Ex: thien cao
        public static String shortName(String str){
            String[] shortname=str.split("\\s+");
            return shortname[shortname.length-1]+" "+shortname[0];

        }
        //tao hashtag Ex: #thiencao
        public static String hashtagName(String str){
            /*String[] hashtag=str.split("//s");*/
            String[] hashtag=str.split("\\s+");
            return "#"+hashtag[hashtag.length-1]+hashtag[0];
        }
        //viết hoa các nguyên âm
        public static String upperCaseAllVowel(String str){
            String vowel="ueoai";
            StringBuilder newStr=new StringBuilder();

            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(vowel.contains(String.valueOf(c))){
                    newStr.append(Character.toUpperCase(c));
                }
                else newStr.append(c);
            }
            return newStr.toString();
        }
        //viết hoa các chữ N trong string
        public static String upperCaseAllN(String str){
            return str.replace("n","N");
        }
    public static void main(String[] args){
        String str = "Cao Huu Thien";
        System.out.println("Short name: " + shortName(str));
        System.out.println("Hashtag name: "+hashtagName(str));
        System.out.println("Upper case the vowel: "+upperCaseAllVowel(str));
        System.out.println("Upper case letter n: "+ upperCaseAllN(str));
    }
}


