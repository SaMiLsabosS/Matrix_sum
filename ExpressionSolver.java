import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;
public class ExpressionSolver
{
    private ArrayList<String> expression;
    private String originalEquation;
    private int solution;
    public ExpressionSolver(String s){ //Arrays.asList(s.split(String s)) is an alternative
        originalEquation=s;
        expression=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
               if(!s.substring(i,i+1).equals(" "))
                  expression.add(s.substring(i,i+1));          
    }
         
    public void setExpression(String s){ //split(String s) is an alternative
        originalEquation=s;
        expression=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
               if(!s.substring(i,i+1).equals(" "))
                  expression.add(s.substring(i,i+1));
    }
    // valueOf(String s) to convert String to integer
    // toString(int i) to convert integer to String
    public void solveExpression(){
       for(int i=0;i<expression.size();i++){
           int number1=0;
           int number2=0;
           int result=0;
           if(expression.get(i).equals("*")){
              number1=parseInt(expression.get(i-1),10);
              number2=parseInt(expression.get(i+1),10);
              result=number1*number2;
              expression.remove(i+1);
              expression.remove(i);    
              expression.set(i-1,Integer.toString(result));
              i--;
           }
           else if(expression.get(i).equals("/")){
              number1=parseInt(expression.get(i-1),10);
              number2=parseInt(expression.get(i+1),10);
              result=number1/number2;
              expression.remove(i+1);
              expression.remove(i);    
              expression.set(i-1,Integer.toString(result));
              i--;                      
           }
       }
       for(int i=0;i<expression.size();i++){  
           int number1=0;
           int number2=0;
           int result=0;
           if(expression.get(i).equals("+")){
              number1=parseInt(expression.get(i-1),10);
              number2=parseInt(expression.get(i+1),10); 
              result=number1+number2;
              expression.remove(i+1);
              expression.remove(i);    
              expression.set(i-1,Integer.toString(result));
              i--;                 
           }
           else if(expression.get(i).equals("-")){
              number1=parseInt(expression.get(i-1),10);
              number2=parseInt(expression.get(i+1),10);
              result=number1-number2;
              expression.remove(i+1);
              expression.remove(i);    
              expression.set(i-1,Integer.toString(result));
              i--;                                 
           }
       }
       solution=Integer.valueOf(expression.get(0));
    }

    public String toString(){
        return originalEquation+" = "+solution;
    }
}