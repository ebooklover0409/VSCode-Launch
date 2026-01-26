package ChapterThree;

import java.util.Random; 
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {

        Random random = new Random (); 
        int number = random.nextInt(100) + 1; 
        System.out.println(number); 
  

    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?"); 
            int userNumber; 
    
    Scanner in = new Scanner(System.in);
   
    System.out.println("Type a number: "); 
    userNumber = in.nextInt(); 
    System.out.println("Your guess is: " + userNumber);
    System.out.println("The number I was thinking of is: " + number); 
    
    int incorrectBy;
    incorrectBy = Math.abs(number - userNumber); 

    System.out.println("You were off by: " + incorrectBy); 
    }
}
