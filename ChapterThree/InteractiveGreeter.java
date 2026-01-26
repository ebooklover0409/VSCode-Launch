package ChapterThree;

import java.util.Scanner; 

public class InteractiveGreeter {
  // to do: What their name is, whree they are from, how old, favorite activity, how much donate
  // store and give greeting based on this; ask them what they like to do; use that too
  
  public static void main(String[] args) { 
    Scanner responsescanner = new Scanner(System.in); 

    // storage variables
    String name; 
    String location; 
    String age; 
    String activity; 
    int donation; 
    String likes; 

    // questions 
    System.out.println("Hello! What is your name? "); 
        name = responsescanner.nextLine(); 
    System.out.println("Where are you from, " + name + "? "); 
        location = responsescanner.nextLine(); 
    System.out.println("How old are you? "); 
        age = responsescanner.nextLine(); 
    System.out.println("What is your favorite activity? "); 
        activity = responsescanner.nextLine(); 
    System.out.println("How much are you donating today in numbers? "); 
        donation = responsescanner.nextInt(); 
    responsescanner.nextLine(); // consume the newline left by nextInt()
    
    // greeting off input 

    System.out.println("Nice to meet you " + name + "! " + location + " is a really cool place. "); 
    System.out.println("I also love " + activity + "! And thank you for your donation!"); 
    System.out.println("Is there any other activiies you like to do? "); 
    likes = responsescanner.nextLine();
    System.out.println(likes + " sounds super cool!");


    
  }
}
