import static java.lang.System.*;
import java.util.Scanner;
public class CoinFlip
{
    public static void main(String[] arqs){
        Scanner k = new Scanner(System.in);
        Player player = new Player();
        String play="Y";
        out.print("What is your name? ");
        player.setName(k.nextLine());
        out.print("How much money is in your wallet? ");
        player.getWallet().setMoney(k.nextInt());
        out.println(player);
        while(play.equals("Y")){
          out.print("How much do you want to bet? ");
          player.setBet(k.nextInt());
          out.print("Do you want to bet on heads<H> or tails<T>? ");
          player.setHeadsOrTails(k.next());
          out.println(player.winOrLose());
          out.println(player);
          out.println("Do you want to play again <Y> or <N>? ");
          play=k.next();
        }
        out.println("Thank you for playing");
    }
}
