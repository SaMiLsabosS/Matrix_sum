import java.util.Arrays;
public class TheRace
{
    private int one;
    private int two;
    private int oneCount;
    private int twoCount;
    private int[] track;
    private int turn;
    private int winner;
    public TheRace()
    {
        one=0;
        two=0;
        while(one==two)
        {
            one=(int)(Math.random()*17);
            two=(int)(Math.random()*17);
        }
        oneCount=0;
        twoCount=0;
        track=new int[18];
        track[one]=1;
        track[two]=2;
        turn=1;
        winner=0;
    }
    
    public boolean turn()
    {    
        if(winner!=0)
            return false;
        if(turn==1)
        {   
            track[one]=0;
            one+=(int)(Math.random()*6)+1;
            if(one>17)
            {
                one=0;
                oneCount++;
            }
            if(one==two)
            {
                two=0;
                track[two]=2;
            }
            if(one==0 && two==0)
                one=1;
            track[one]=1;
            turn++;
        }
        if(turn==2)
        {   
            track[two]=0;
            two+=(int)(Math.random()*(6-1))+1;
            if(two>17)
            {
                two=0;
                twoCount++;
            }
            if(two==one)
            {
                one=0;
                track[one]=1;               
            }
            if(two==0 && one==0)
                two=1;
            track[two]=2;
            turn--;
        }
        if(oneCount==5)
            winner++;
        if(twoCount==5)
            winner=2;
        return true;
    }
    
    public String getWinner()
    {
        return "" + winner;
    } 
    
    public String toString()
    {
        return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
    }
}