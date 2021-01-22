import static java.lang.System.*;
public class nestedloops
{
    public static void main(String[] arqs){
        out.println(repeatLetter(3,"A"));
        out.println(repeatLetter(7,"X"));
        out.println(repeatLetter(1,"R"));
        out.println(repeatLetter(5,"T"));
        out.println(repeatLetter(4,"W"));
    }
    public static String repeatLetter(int num, String letter){
        String answer="";
        for(int i=0;i<num;i++){
           for(int j=0;j<=i;j++){
              answer+=letter;
           }
           answer+="\n";
        }
        return answer;
    }
}
