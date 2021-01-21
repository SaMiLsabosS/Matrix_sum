
public class Wallet
{
    private int money;
    public Wallet(){
       money = 100;
    }
    public Wallet(int n){
       money = n;
    }
    public void setMoney(int m){
       money = m;
    }
    public void addMoney(int b){
       money+=b;
    }
    public int getMoney(){
       return money;
    }
}
