import java.util.Arrays;
import static java.lang.System.*;
public class ArrayFunHouseOne
{
    public static void main(String[] arqs){
        int[] arrOne = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        out.println(Arrays.toString(arrOne));
        out.println("sum of the spots 3-6 = "+sumOfSpots(arrOne,3,6));
        out.println("sum of the spots 2-9 = "+sumOfSpots(arrOne,2,9));
        out.println("# of 4s  =  "+count(arrOne,4));
        out.println("# of 9s  =  "+count(arrOne,9));
        out.println("# of 7s  =  "+count(arrOne,7));
        out.println("new array with all 7s removed  =  "+Arrays.toString(remove(arrOne,7)));
        out.println("# of 7s  =  "+count(remove(arrOne,7),7)+"\n\n");
        int[] arrTwo = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
        out.println(Arrays.toString(arrTwo));
        out.println("sum of the spots 3-16 = "+sumOfSpots(arrTwo,3,16));
        out.println("sum of the spots 2-9 = "+sumOfSpots(arrTwo,2,9));
        out.println("# of 0s  =  "+count(arrTwo,0));
        out.println("# of 3s  =  "+count(arrTwo,3));
        out.println("# of 7s  =  "+count(arrTwo,7));
        out.println("new array with all 7s removed  =  "+Arrays.toString(remove(arrTwo,7)));
        out.println("# of 7s  =  "+count(remove(arrTwo,7),7));
    }
    
    public static int sumOfSpots(int[] array, int start, int end){
        int sum=0;
        for(int i=start;i<end+1;i++){
           sum+=array[i];
        }
        return sum;
    }
    
    public static int count(int[] array, int target){
        int count=0;
        for(int x:array){
            if(x==target)
              count++; 
        }
        return count;
    }
    
    public static int[] remove(int[] array, int removeTarget){
        int[] arrOne=new int[array.length-count(array,7)];
        int spot=0;
        for(int i=0;i<array.length;i++){
           if(array[i]!=removeTarget){
             arrOne[spot]=array[i];
             spot++;
           }
        }
        return arrOne;
    }
}
