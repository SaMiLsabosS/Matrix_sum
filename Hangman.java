import java.util.Arrays;
public class Hangman
{
   private String[] gallows = {"head ","body ","leftArm ","rightArm ","leftLeg ","rightLeg "};
   private String[] guesses;
   private String secretWord, hint, gallow;
   private int wrongNumberCount, guess;
   public Hangman(String s){
      guesses = new String[0];
      gallow = "gallows = rope ";
      secretWord=s;
      for(int i=0;i<s.length();i++)
         hint+="?";
      hint=hint.substring(4);
      wrongNumberCount=0;
      guess=0;
   }
   public void setGallows(String[] ga){
      gallows=ga; 
   }
   public void setGuesses(String[] gu){
      guesses=gu; 
   }
   public void setHint(String h){
      hint=h; 
   }
   public void setSecretWord(String s){
      secretWord=s;
   }
   public String[] getGallows(){
      return gallows;
   }
   public String[] getGueeses(){
      return guesses;
   }
   public String getSecretWord(){
      return secretWord;
   }
   public String getHint(){
      return hint;
   }
   public String guess(String letter){
      String output = "";
      String[] guess = new String[guesses.length+1];
      if(guesses.length==0){
          guess[guesses.length]=letter;
      }
      else{
        for(int i=0;i<guesses.length;i++){
          guess[i] = guesses[i];
          guess[guesses.length]=letter;
        }
      }
      guesses = guess;
      for(int i=0;i<secretWord.length();i++){
        if(secretWord.substring(i,i+1).equals(letter)){
          output = "good guess";
          hint = hint.substring(0,i)+letter+hint.substring(i+1);
        }
      } 
      if(output.equals("")){
        output="bad guess";
        gallow+=gallows[wrongNumberCount];
        wrongNumberCount++;
      }
      return output;
   }
   public boolean gameOver(){
      if((gallow.equals("rightLeg")) || secretWord.equals(hint))
         return true;
      return false;
   }
   public String toString(){
      return Arrays.toString(guesses)+"\n"+gallow+"\n"+hint+"\n";
   }
}
