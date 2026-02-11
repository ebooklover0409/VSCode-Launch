package ChapterSix;
import java.util.Scanner; 

public class Triangles {
    
    public static void main(String[] args) {
        
        int n = GetRowSize();

        // Get fill character 
        Scanner userRequestFill = new Scanner(System.in); 
        System.out.print("Enter fill character: ");
        String fill = userRequestFill.nextLine();

        //call for triangle 
        CreateEquilaterialTriangle(n, fill); 
        RepeatRequest();
        
    }

    public static int GetRowSize() { 
        // Get row size
        Scanner userRequestRow = new Scanner(System.in); 
        System.out.print("Enter row size: "); 
        int n = userRequestRow.nextInt();

        if (n <= 0) {
            System.out.println("Row size must be a positive integer.");
            main(null);
        } 
        else if (n > 50) {
            System.out.println("Row size must be less than or equal to 50.");
            main(null);
        }
        return n; 
    }

    public static void RepeatRequest() { 
        Scanner userRepeat = new Scanner(System.in); 
        System.out.print("Do you want to create another triangle? (yes/no): ");
        String repeat = userRepeat.nextLine();
        if (repeat.equalsIgnoreCase("yes")) {
            main(null);
        } else {
            System.out.println("Goodbye!");
        }
    }

    public static void CreateEquilaterialTriangle(int n, String fill) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for centering
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print fill characters (odd numbers: 1, 3, 5, ...)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }
        }
    }


}
