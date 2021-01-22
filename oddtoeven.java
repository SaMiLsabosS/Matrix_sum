import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
public class oddtoeven
{
    public static void main(String[] arqs){
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
       out.println(oddToEven(list));
       list = new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
       out.println(oddToEven(list));
   }
   public static int oddToEven(ArrayList<Integer> list){
       int oddNum=0; 
       int locationNum1=0;
       for(int i=list.size()-1;i>=0;i--)
          if(list.get(i)%2==1){ 
            oddNum=list.get(i);
            locationNum1=i;
          }  
       int evenNum=1; 
       int locationNum2=0;
       for(int i=0;i<list.size();i++)
          if(list.get(i)%2==0){
            evenNum=list.get(i);
            locationNum2=i;
          }
       if(oddNum==0 || evenNum==1)
         return -1;
       return locationNum2-locationNum1; 
   }
}
