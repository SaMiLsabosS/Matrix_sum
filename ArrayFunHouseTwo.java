import static java.lang.System.*;
import java.util.Arrays;
public class ArrayFunHouseTwo
{
    public static void main(String[] arqs){
        int[] arrayOne = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayTwo = {1,2,3,9,11,20,30};
        int[] arrayThree = {9,8,7,6,5,4,3,2,0,-2};
        int[] arrayFour = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
        out.println(Arrays.toString(arrayOne));
        out.println("is going Up ?  "+increase(arrayOne));
        out.println(Arrays.toString(arrayTwo));
        out.println("is going Up ?  "+increase(arrayTwo));
        out.println(Arrays.toString(arrayThree));
        out.println("is going Up ?  "+increase(arrayThree));
        out.println(Arrays.toString(arrayFour));
        out.println("is going Up ?  "+increase(arrayFour)+"\n\n");
        out.println(Arrays.toString(arrayOne));
        out.println("is going Down ?  "+decrease(arrayOne));
        out.println(Arrays.toString(arrayTwo));
        out.println("is going Down ?  "+decrease(arrayTwo));
        out.println(Arrays.toString(arrayThree));
        out.println("is going Down ?  "+decrease(arrayThree));
        out.println(Arrays.toString(arrayFour));
        out.println("is going Down ?  "+decrease(arrayFour)+"\n\n");
        out.println(Arrays.toString(arrayFour));
        out.println("first 7 values greater than 9  "+Arrays.toString(greaterThan(arrayFour,7,9)));
        out.println("first 5 values greater than 15  "+Arrays.toString(greaterThan(arrayFour,5,15)));
    }
    
    public static boolean increase(int[] array){
        int count=0;
        for(int i=1;i<array.length;i++)
          if(array[i-1]<array[i])
          count++;
        if(count==array.length-1)
          return true;
        return false;
    }
    
    public static boolean decrease(int[] array){
        int count=0;
        for(int i=1;i<array.length;i++)
          if(array[i-1]>array[i])
          count++;
        if(count==array.length-1)
          return true;
        return false;
    }
    
    public static int[] greaterThan(int[] array,int values,int greaterNum){
        int[] specific=new int[values];
        int spot=0;
        for(int i=0;spot<values;i++) // you don't always need "i" when you are trying to stop the for loop  
           if(array[i]>greaterNum){
              specific[spot]=array[i];
              spot++;
           }
        return specific;
    }
}
