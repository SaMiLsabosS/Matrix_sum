import java.util.Arrays;
public class CardRunner
{
    public static void main(String[] args)
    {
        RewardsCard card1 = new RewardsCard("Evan Wolfe");
        RewardsCard card2 = new RewardsCard("Alex Rodriguez");
        RewardsCard card3 = new RewardsCard("Lord Villapando");
        
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        
        card1.recordTransaction(50.00, 0, "09/28/20");
        card1.recordTransaction(36.24, 0, "09/30/20");
        card1.recordTransaction(76.25, 0, "10/04/20");
        card1.recordTransaction(90.00, 10, "10/12/20");
        
        System.out.println(card1);
    }
}