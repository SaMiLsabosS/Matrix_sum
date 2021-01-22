import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
public class sumvaluesfirst
{
    public static void main(String[] arqs){
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(32767));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(255,255));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,1));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
       out.println(sumValues(list));
       list = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
       out.println(sumValues(list));
   }
   public static int sumValues(ArrayList<Integer> list){
       if(list.size()==1)
         return -1;
       int sum=0;
       Integer keep = list.get(0);
       for(int i=1;i<list.size();i++)
          if(keep<list.get(i))
             sum+=list.get(i);
       if(sum==0)
         return -1;
       return sum;
   }
}
