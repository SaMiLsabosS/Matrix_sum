import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
public class mostfrequent
{
   public static void main(String[] arqs){
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,10,10,40,30,20,10));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(32767));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(255,255));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456,10,10,2,2,2,2,2,2,2));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(12,12,15,18,21,23,1000));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1));
       out.println(mostFrequent(list));
       list = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
       out.println(mostFrequent(list));
   }
   public static int mostFrequent(ArrayList<Integer> list){
       if(list.size()<3)
         return list.get(0);
       int numberOfSameNum=0;
       int sameNum=0;
       for(int i=0;i<list.size();i++){
          if(countNum(list.get(i), list) > numberOfSameNum){
              numberOfSameNum = countNum(list.get(i), list);
              sameNum = list.get(i);
          }
       }
       return sameNum;
   }
   public static int countNum(int num,ArrayList<Integer> list){
       int count=0;
       for(int i=0;i<list.size();i++)
          if(list.get(i)==num)
             count++;              
       return count;
   }
}
