import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;
public class ArrayFunHouse1
{
    public static void main(){
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7));
       out.println(list);
       out.println("sum of spots 3-6  =  "+sumNums(list,3,6));
       out.println("sum of spots 2-9  =  "+sumNums(list,2,9));
       out.println("# of 4s  =  "+countNum(list,4));
       out.println("# of 9s  =  "+countNum(list,9));
       out.println("# of 7s  =  "+countNum(list,7));
       out.println("new array with all 7s removed  =  "+removeNum(list,7));
       out.println("# of 7s  =  "+countNum(list,7)+"\n\n");
       list = new ArrayList<Integer>(Arrays.asList(7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7));
       out.println(list);
       out.println("sum of spots 3-16  =  "+sumNums(list,3,16));
       out.println("sum of spots 2-9  =  "+sumNums(list,2,9));
       out.println("# of 0s  =  "+countNum(list,0));
       out.println("# of 3s  =  "+countNum(list,3));
       out.println("# of 7s  =  "+countNum(list,7));
       out.println("new array with all 7s removed  =  "+removeNum(list,7));
       out.println("# of 7s  =  "+countNum(list,7));
    }
    public static int sumNums(ArrayList<Integer> list, int spot, int spot2){
       int sum=0;
       for(int i=spot;i<=spot2;i++)
          sum+=list.get(i);        
       return sum;
    }
    public static int countNum(ArrayList<Integer> list, int num){
       int count=0;
       for(int i=0;i<list.size();i++)
          if(list.get(i)==num)
            count++;
       return count;
    }
    public static ArrayList<Integer> removeNum(ArrayList<Integer> list, int num){
       for(int i=0;i<list.size();i++)
          if(list.get(i)==num)
            list.remove(i);
       return list;
    }
}
