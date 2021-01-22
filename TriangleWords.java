import static java.lang.System.*;
public class TriangleWords
{
    public static void main(String[] arqs){
        out.println(triangle("WOW"));
        out.println(triangle("BEN"));
        out.println(triangle("SAMMY"));
        out.println(triangle("WILE"));
        out.println(triangle("APLUSCOMPSCI"));
    }
    public static String triangle(String word){
        String output="";
        for(int i=0;i<word.length()-1;i++)
           output+=" ";  
        output+=word.substring(0,1);
        for(int i=0;i<word.length()-1;i++)
           output+=" "; 
        output+="\n";
        for(int i=0;i<word.length()-2;i++){
           for(int j=0;j<word.length()-2-i;j++)
              output+=" ";           
           output+=word.substring(i+1,i+2);
           for(int k=0;k<(i*2)+1;k++)
              output+=" ";
           output+=word.substring(i+1,i+2);
           for(int l=1;l<word.length()-2-i;l++)
              output+=" ";
           output+="\n";
        }
        for(int i=word.length();i>0;i--)
           output+=word.substring(i-1,i);
        for(int i=1;i<word.length();i++)
           output+=word.substring(i,i+1);
        return output+"\n\n";
    }
}
