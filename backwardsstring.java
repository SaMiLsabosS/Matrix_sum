import static java.lang.System.*;
public class backwardsstring{
  public static void main(String arqs[]){
      out.println(print(firstLetter("Hello"),lastLetter("Hello"),backwards("Hello"),"Hello"));
      out.println(print(firstLetter("World"),lastLetter("World"),backwards("World"),"World"));
      out.println(print(firstLetter("JukeBox"),lastLetter("JukeBox"),backwards("JukeBox"),"JukeBox"));
      out.println(print(firstLetter("TCEA"),lastLetter("TCEA"),backwards("TCEA"),"TCEA"));
      out.println(print(firstLetter("UIL"),lastLetter("UIL"),backwards("UIL"),"UIL"));
  }  
  public static String print(String first, String last, String backwards, String word){
      return first+"\n"+last+"\n"+backwards+"\n"+word+"\n\n";
  }  
  public static String firstLetter(String word){
      return word.substring(0,1);
  }  
  public static String lastLetter(String word){
      return word.substring(word.length()-1,word.length());
  }  
  public static String backwards(String word){
      String backward = "";
      for(int i=word.length()-1;i>=0;i--){
          backward += word.substring(i,i+1);
      }
      return backward;
  }
}
