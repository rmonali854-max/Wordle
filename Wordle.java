import java.util.Scanner;
import java.util.Random;
 
public class Wordle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        //Array of 5 letter words
        String[] words={"apple","grape","mango","chair","plant"};
        //Select a random word
        int randomNumber=r.nextInt(words.length);
        String word=words[randomNumber];
        System.out.println("---Wordle Game---");
        System.out.println("Guess the 5-letter word");
        System.out.println("You have 6-attempts");
        //6 attempts
        for(int attempt=1;attempt<=6;attempt++){
              System.out.print("\nAttempt "+attempt +":");
              String guess=sc.nextLine().toLowerCase();
              //check length
              if(guess.length()!=5){
              System.out.println("Please enter exactly 5 letters");
              attempt--;
              continue;
              }
    
              if(guess.equals(word)){
              System.out.println("\n"+guess.toUpperCase()+"[G]");
              System.out.println("Congratuations! You won");
              break;
              }
              //Check each letter
              for(int i=0;i<5;i++){
                char guessletter=guess.charAt(i);
                char wordletter=word.charAt(i);
                //Correct letter and corre
                if (guessletter==wordletter) {
                    System.out.print(guessletter+"[G]");
                    
                }
                //Letter exists but position is wrong
                else if (word.indexOf(guessletter)!=1) {
                     System.out.print(guessletter+"[Y]");
                    
                }
                //Letter does not print
                else{
                     System.out.print(guessletter+"[X]");
                }
              }
              System.out.println();
              //If all attempts are used
              if (attempt==6) {
                System.out.println("Game over!");
                System.out.println("The word was:"+word);
                
              }



        } 
        sc.close();


        

    }
}