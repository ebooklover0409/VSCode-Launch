package ChapterThree;
import java.util.Random; 
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Random random = new Random (); 
        int number = random.nextInt(100) + 1; 

    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?"); 
            int userNumber; 
    
    Scanner in = new Scanner(System.in);
    System.out.println("Type a number: "); 
    userNumber = in.nextInt(); 
    System.out.println("Your guess is: " + userNumber);
    guessAssister(userNumber, number, 1); 
    }

    public static void guessAssister(int userNumber, int number,int guessCount) {
        if((userNumber > number) && (guessCount < 3)) { 
            System.out.println("Your guess is too high. Try again! Enter a number:"); 
                Scanner in = new Scanner(System.in); 
                userNumber = in.nextInt(); 
                guessAssister(userNumber, number, guessCount +1); 
        }
        else if((userNumber < number) && (guessCount < 3)) { 
            System.out.println("Your guess is too low. Try again! Enter a number:"); 
                Scanner in = new Scanner(System.in); 
                userNumber = in.nextInt(); 
                guessAssister(userNumber, number, guessCount +1); 
        }
        else if ((userNumber != number) && (guessCount >= 3)) { 
            System.out.println("You have used all your guesses. "); 
                overThreeGuesses(userNumber, number);
        }
        else { 
            System.out.println("Congratulations! You guessed the number!"); 
            return; 

        }
   
    }

    public static void overThreeGuesses(int userNumber, int number) { 
        System.out.println("The number I was thinking of is: " + number); 
    
    int incorrectBy;
    incorrectBy = Math.abs(number - userNumber); 

    System.out.println("You were off by: " + incorrectBy); 
    }
}

