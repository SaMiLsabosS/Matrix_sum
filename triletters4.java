import static java.lang.System.*;
public class triletters4
{
    public static void main(String[]arqs){
       out.println(reverseOrder(3,"R")); 
       out.println(reverseOrder(4,"B")); 
       out.println(reverseOrder(5,"X")); 
       out.println(reverseOrder(2,"E")); 
       out.println(reverseOrder(1,"T")); 
    }
    public static String reverseOrder(int num, String letter){
       String answer="";
        for(int i=num;i>0;i--){
          for(int k=num;k>i;k--){
             answer+=" ";
          }
          for(int j=0;j<i;j++){
             answer+=letter;
          }
          answer+="\n";
       }
       return answer;
    }
}
