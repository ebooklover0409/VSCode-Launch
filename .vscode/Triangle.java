import java.util.Scanner; 

public class Triangle {
    public static void main(String[] args) { 
        Scanner number = new Scanner(System.in); 
        System.out.print("Enter the length 1: "); 
            double length1 = number.nextDouble(); 
        System.out.print("Enter the length 2: "); 
            double length2 = number.nextDouble(); 
        System.out.print("Enter the length 3: "); 
            double length3 = number.nextDouble(); 
        validateTriangle(length1, length2, length3);
    }

    public static void validateTriangle(double length1, double length2, double length3) {
        if ((length1 + length2 > length3) && (length1 + length3 > length2) && (length2 + length3 > length1)) {
            System.out.println("The lengths form a valid triangle.");
        } else {
            System.out.println("The lengths do not form a valid triangle.");
        }
    }
}
