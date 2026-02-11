
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        while (!in.hasNextInt()) { System.out.print("Please enter an integer for a: "); in.next(); }
        int ai = in.nextInt();

        System.out.print("Enter integer b: ");
        while (!in.hasNextInt()) { System.out.print("Please enter an integer for b: "); in.next(); }
        int bi = in.nextInt();

        System.out.print("Enter integer c: ");
        while (!in.hasNextInt()) { System.out.print("Please enter an integer for c: "); in.next(); }
        int ci = in.nextInt();

        solver((double) ai, (double) bi, (double) ci);
        in.close();
    }

    public static void solver(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions (0 = 0).");
                } else {
                    System.out.println("No solution (constant non-zero).");
                }
            } else {
                double root = -c / b;
                System.out.printf("Linear solution: %.6f%n", root);
            }
            return;
        }

        double discriminant = b * b - 4.0 * a * c;
        if (discriminant > 0) {
            double sqrt = Math.sqrt(discriminant);
            double r1 = (-b + sqrt) / (2.0 * a);
            double r2 = (-b - sqrt) / (2.0 * a);
            System.out.printf("Two real roots: %.6f and %.6f%n", r1, r2);
        } else if (discriminant == 0) {
            double r = -b / (2.0 * a);
            System.out.printf("One real root: %.6f%n", r);
        } else {
            double real = -b / (2.0 * a);
            double imag = Math.sqrt(-discriminant) / (2.0 * a);
            System.out.printf("Complex roots: %.6f + %.6fi and %.6f - %.6fi%n", real, imag, real, imag);
        }
    }
}
