import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number){
	    ArrayList<Integer> newList = new ArrayList<Integer>();
	    for(int i=2;i<=number/2;i++)
	        if(number%i==0)
	          newList.add(i);	        	    
	    return newList;
	}	
	public static void keepOnlyCompositeNumbers(List<Integer> nums){
	    for(int i=0;i<nums.size();i++){
	       ArrayList<Integer> factorsOfCompositeList = getListOfFactors(nums.get(i));
	       if(factorsOfCompositeList.size()==0)
	         nums.remove(i);
	    }
	}
}