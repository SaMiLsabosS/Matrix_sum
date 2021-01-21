import static java.lang.System.*;
public class vowelcounter{
    public static void main(String arqs[]){
        out.println(vowelChanger("abcdef"));
        out.println(vowelChanger("hhhhhhh"));
        out.println(vowelChanger("aaaaaaa"));
        out.println(vowelChanger("catpigdatrathogbogfrogmoosegeese"));
        out.println(vowelChanger("hhhhhhh123456HHHHDH"));
        out.println(vowelChanger("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj")+"\n");
        out.println(vowelChanger("x"));
        out.println(vowelChanger("e"));
    }
    public static String vowelChanger(String word){
        String vowels = "aeiouAEIOU";
        String output = "";
        int number = 0;
        String letter = "";
        for(int i=0;i<word.length();i++){
           letter = word.substring(i,i+1);
           if(number>9){
              number = 0;
           }
           if(vowels.indexOf(letter)!=-1){
              output += number;
              number++;
           }
           else{
              output += letter;
           }
        }
        return output;
    }
}
