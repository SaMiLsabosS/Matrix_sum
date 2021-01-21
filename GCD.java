import static java.lang.System.*;
public class GCD{
  public static void main(String arqs[]){
      out.println(findGCD(5,25));
      out.println(findGCD(4,400));
      out.println(findGCD(8,80));
      out.println(findGCD(15,45));
      out.println(findGCD(6,66));
      out.println(findGCD(9,9));
      out.println(findGCD(3,543));
  }
  public static String findGCD(int num1, int num2){
      String statement = ""; // organization purposes
      int gcd = 0;
      for(int i=1;i<=num1;i++){
          if(num1%i==0 && num2%i==0) //if divisable by i, gcd is set until the actual gcd comes thorugh and sets it
            gcd = i;
      }
      statement = "the gcd of "+num1+" and "+num2+" is "+gcd;
      return statement;
  }
}