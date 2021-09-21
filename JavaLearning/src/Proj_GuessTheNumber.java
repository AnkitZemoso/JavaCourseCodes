import java.util.Scanner;
import java.util.Random;


public class Proj_GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(100)+1;
        int ourGuess;
        int guessCount=0;
        boolean guessedNumber=false;

        while(!guessedNumber){
            System.out.println("Enter your integer guess");
            ourGuess=keyboard.nextInt();
            guessCount++;
            if(ourGuess>=1 && ourGuess<=100){
                if(ourGuess==randomNumber){
                    guessedNumber=true;
                    System.out.println("Congratulations! you guessed the number in "+
                            guessCount + " guesses!. Thanks for playing!");
                }
                else if(ourGuess>randomNumber){
                    System.out.println("Your guess was too high!");
                }
                else if(ourGuess<randomNumber){
                    System.out.println("Your guess was too low!");
                }
            }
            else{
                System.out.println("That was a wasted guess! You must pick a number in between 1-100");
            }

        }

    }
}
