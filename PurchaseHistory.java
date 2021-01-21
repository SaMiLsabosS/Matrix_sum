public class PurchaseHistory
{
    private int pointsEarned, pointsUsed;
    private double totalBill;
    private String date;
    public PurchaseHistory(){
        pointsEarned = 0;
        pointsUsed = 0;
        date = "";
        totalBill = 0.0;
    }
    public PurchaseHistory(double t, int u, String d){
        pointsUsed = u;
        date = d;
        totalBill = t;
        pointsEarned = (int)(t-u)/10;
    }
    public void setPointsEarned(int e){
        pointsEarned = e;
    }
    public void setPointsUsed(int u){
        pointsUsed = u;
    }
    public void setDate(String d){
        date = d;
    }
    public void setTotalBill(double t){
        totalBill = t;
    }
    public int getPointsEarned(){
        return pointsEarned;
    }
    public int getPointsUsed(){
        return pointsUsed;
    }
    public String getDate(){
        return date;
    }
    public double getTotalBill(){
        return totalBill;
    }
}