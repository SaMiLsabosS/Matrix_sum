import static java.lang.System.*;
public class coolNumber{
    public static void main(String arqs[]){
        out.println(countCoolNumbers(250));
        out.println(countCoolNumbers(1250));
        out.println(countCoolNumbers(2250));
        out.println(countCoolNumbers(5500));
        out.println(countCoolNumbers(9500));
        out.println(countCoolNumbers(23500));
        out.println(countCoolNumbers(32500));
    }
    public static boolean isCoolNum(int number){
        if(((number%3)==1) && ((number%4)==1) && ((number%5)==1) && ((number%6)==1))  
           return true;
        return false;
    }
    public static String countCoolNumbers(int number){
        String statement = ""; // organization purposes
        int coolNumber = 0;
        for(int i=6;i<=number;i++){ //in a for loop to use every number from 6 to the max number
           if(isCoolNum(i)==true){ //used to check each number if they are true
              coolNumber++; //increases number that will be returned
           }
        }
        statement = coolNumber+" cool numbers between 6 - "+number;
        return statement;
    }
}