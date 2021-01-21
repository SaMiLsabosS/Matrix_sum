public class RewardsCard
{
    private String name, accountNumber;
    private static int id=1;
    private int points;
    private PurchaseHistory purchaseHistory;
    private static boolean purchase = false;
    private String outcome;
    public RewardsCard(){
       name="sus";
       points=0;
       accountNumber="0000000"+id;
       id++;
       purchaseHistory = new PurchaseHistory();
    }
    public RewardsCard(String n){
       name=n;
       points=0;
       accountNumber="0000000"+id;
       id++;
       purchaseHistory = new PurchaseHistory();
       outcome="";
    }
    public void setName(String n){
       name=n;
    }
    public void setAccountNumber(String a){
       accountNumber=a;
    }
    public static void setID(String id){
       id=id;
    }
    public void setPoints(int p){
       points=p;
    }
    public void recordTransaction(double m, int p, String d){
       purchaseHistory = new PurchaseHistory(m,p,d);
       purchase = true;
       outcome+="\n"+String.format("%-16s$%-16.2f%-16d%-10000d", getPurchaseHistory().getDate(),getPurchaseHistory().getTotalBill(), getPurchaseHistory().getPointsUsed(), getPurchaseHistory().getPointsEarned());
       points+=((m-p)/10)-p;
    }
    public String getName(){
       return name;
    }
    public String getAccountNumber(){
       return accountNumber;
    }
    public static int getID(){
       return id;
    }
    public int getPoints(){
       return points;
    }
    public PurchaseHistory getPurchaseHistory(){
       return purchaseHistory;
    }
    public String toString(){
       return "This Plucker's card belongs to "+name+"\nAccount Number is: "+accountNumber+
       "\nTheir currrent rewards points are: "+points+
       "\nTheir purchase history is:\ndate            total bill      points used     points earned"+outcome+"\n";
    }
}