public class Player
{
    private String name,headsOrTails;
    private Wallet wallet;
    private int wins,losses,bet;
    public Player(){
        name="";
        headsOrTails="";
        wins=0;
        losses=0;
        bet=0;
        wallet=new Wallet();
    }
    public Player(String n, int wi, int l, int b,String h, Wallet w){
        name=n;
        wins=wi;
        losses=l;
        bet=b;
        headsOrTails=h;
        wallet=w;
    }
    public void setName(String n){
       name=n;
    }
    public void setHeadsOrTails(String h){
       headsOrTails=h;
    }
    public void setWins(int w){
       wins=w;
    }
    public void setLosses(int l){
       losses=l;
    }
    public void setBet(int b){
       bet=b;
    }
    public String getName(){
       return name;
    }
    public String getHeadsOrTails(){
       return headsOrTails;
    }
    public int getWins(){
       return wins;
    }
    public int getLosses(){
       return losses;
    }
    public int getBet(){
       return bet;
    }
    public Wallet getWallet(){
       return wallet;
    } 
    public String toString(){
       return name+" has "+wins+" win(s) and "+losses+" loss(es) with "+wallet.getMoney()+" dollars";
    }
    public String winOrLose(){
       int rand = ((int)(Math.random()*2)+1);
       String side = "";
       int negBet = bet*-1;
       if(rand==1)
          side = "H";
       else
          side = "T"; 
       String output = "Coin flip is: "+side;
       if(side.equals(headsOrTails)){
          wins++;
          output+="\nyou win";
          wallet.addMoney(bet);
       }
       else{
          losses++;
          output+="\nyou lost";
          wallet.addMoney(negBet);
       }
       return output;
    }  
}
    


