import static java.lang.System.*;
public class BoxWord
{
    public static void main(String[] arqs){
       out.println(box("SQAURE")); 
       out.println(box("BOX")); 
       out.println(box("A")); 
       out.println(box("IT")); 
       out.println(box("TOAD")); 
    }
    public static String box(String word){
       String output=word+"\n";
       if(word.length()<=1)
         return word+"\n\n";
       for(int i=1;i<word.length()-1;i++){
          output+=word.substring(i,i+1);
          for(int j=word.length()-2;j>0;j--){
             output+=" ";
          }
          output+=word.substring(word.length()-i-1,word.length()-i)+"\n";
       }
       for(int i=word.length();i>0;i--){
          output+=word.substring(i-1,i);
       }
       output+="\n\n";
       return output;
    }
}
