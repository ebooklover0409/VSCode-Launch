package ChapterThree;
import java.util.Scanner;


public class SecondsConversion {

    public static void main(String[] args){ 

        Scanner in = new Scanner(System.in); 
        int enteredSeconds; 

        // ask user for seconds
        System.out.print("Enter number of seconds: "); 
        enteredSeconds = in.nextInt(); 

        // do calculations 
        int hours; 
        int minutes; 
        int seconds; 
        int leftover1; 
        int leftover2; 

        hours = enteredSeconds/3600; 
        leftover1 = enteredSeconds % 3600;
        minutes = leftover1/60;
        leftover2 = leftover1 % 60; 
        seconds = leftover2/1; 

        System.out.println(enteredSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds."); 

    
    }

    
}
