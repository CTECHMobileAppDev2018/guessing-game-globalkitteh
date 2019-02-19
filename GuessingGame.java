import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  
    public static void main(String[] args) {
    
        System.out.println("Welcome to the guessing game.");
        int targetNum;
        int numTries = 0;
        int inputNum = 0;
        boolean errorState = false;
        
        Random randInt = new Random();
        targetNum = (randInt.nextInt(99) + 1); // generates number 0-99, adds 1 for 1-100
        
        while (inputNum != targetNum) {
          
          errorState = false;
          
          System.out.println("Make your guess");
          Scanner input = new Scanner(System.in);
          
          try {
            inputNum = Integer.parseInt(input.nextLine());
          }
          catch(RuntimeException e) {
            System.out.println("That's nogood!");
            errorState = true;
          }
          
          if(errorState == false && (inputNum > 100 || inputNum < 1)) {
            System.out.println("That's nogood. 1-100 range");
          }
          else if (errorState == false && (inputNum < targetNum)) {
            System.out.println("Too low!");
          }
          else if (inputNum > targetNum) {
            System.out.println("Too high!");
          }
          numTries++;
        }
        
        System.out.println("You got it with " + numTries + " tries!");
        
    }
}
