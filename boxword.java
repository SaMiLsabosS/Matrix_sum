import static java.lang.System.*;
public class boxword{
    public static void main(String arqs[]){
        out.println(boxWord("hippo"));
        out.println(boxWord("abcd"));
        out.println(boxWord("it"));
        out.println(boxWord("a"));
        out.println(boxWord("chicken"));
    }
    public static String boxWord(String word){
        String answer = "";
        for(int i=0;i<word.length();i++)
           answer += word + "\n";
        return answer + "\n";
    }
}
