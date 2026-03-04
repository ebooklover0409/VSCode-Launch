import java.util.Scanner;

public class ArrayReversal {
    
    public static void main(String[] args) { 
        Scanner arrayNumbers = new Scanner(System.in); 

        int n = 100; 
        int [] numbers = new int[n]; 

        System.out.println("Enter values (-1 to stop) "); 
        for (int i = 0; i<100; i++) {
           
            System.out.print(": "); 
            int entered; 
            entered = arrayNumbers.nextInt(); 

            numbers[i] += entered; 

            if (entered == -1) {
                break; 
            }
        }

        System.out.println("Your values, reversed: "); 
        
        for (int i = numbers.length -1; i >= 0; i--) { 
            if (numbers[i] != 0) {
                System.out.println(numbers[i]);
            }
        }

    }
}
