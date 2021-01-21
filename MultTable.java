import static java.lang.System.*;
public class MultTable{
    public static void main(String arqs[]) {
      out.println(multTable(5,5));
      out.println(multTable(3,7));
      out.println(multTable(1,6));
      out.println(multTable(9,9));
      out.println(multTable(7,8));
    }
    public static String multTable(int num, int lines){
      int numLine = 1;
      int number = num;
      String multTable = "multiplication table for "+num+"\n";
      for(int i=0;i<lines;i++){
          number = num*numLine;
          multTable += numLine+"      "+number+"\n";       
          numLine++;
      }
      return multTable+"\n\n";
    }
}
