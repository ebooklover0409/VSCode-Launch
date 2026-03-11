package ChapNine;

public class Ch11ExercisesRational{

    //  1
    private int numerator;
    private int denominator;

    //  2
    public Ch11ExercisesRational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    //  7
    public Ch11ExercisesRational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        // Keep negative sign on numerator only
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // 3
    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    // 6
    public String toString() {
        return numerator + "/" + denominator;
    }

    // 8
    public void negate() {
        numerator = -numerator;
    }

    // 9
    public void invert() {
        if (numerator == 0) {
            throw new ArithmeticException("Cannot invert a zero rational.");
        }
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
        // Keep negative sign on numerator
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // 10
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // 11
    public Ch11ExercisesRational reduce() {
        int gcd = gcd(Math.abs(numerator), denominator);
        return new Ch11ExercisesRational(numerator / gcd, denominator / gcd);
    }

    // GCD helper using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 12
    public Ch11ExercisesRational add(Ch11ExercisesRational other) {
        int newNumerator = this.numerator * other.denominator
                         + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Ch11ExercisesRational(newNumerator, newDenominator).reduce();
    }

    // 4/5
    public static void main(String[] args) {

        // 4
        System.out.println("=== Default constructor ===");
        Ch11ExercisesRational r1 = new Ch11ExercisesRational();
        r1.printRational();

        System.out.println("=== Two-argument constructor ===");
        Ch11ExercisesRational r2 = new Ch11ExercisesRational(3, 4);
        r2.printRational();

        // 6
        System.out.println("=== toString ===");
        System.out.println(r2);

        // 8
        System.out.println("=== negate ===");
        Ch11ExercisesRational r3 = new Ch11ExercisesRational(3, 4);
        r3.negate();
        System.out.println(r3);

        // 9
        System.out.println("=== invert ===");
        Ch11ExercisesRational r4 = new Ch11ExercisesRational(3, 4);
        r4.invert();
        System.out.println(r4);

        // 10
        System.out.println("=== toDouble ===");
        Ch11ExercisesRational r5 = new Ch11ExercisesRational(1, 3);
        System.out.println(r5 + " = " + r5.toDouble());

        // 11
        System.out.println("=== reduce ===");
        Ch11ExercisesRational r6 = new Ch11ExercisesRational(6, 9);
        System.out.println(r6 + " reduces to " + r6.reduce());

        // 12
        System.out.println("=== add ===");
        Ch11ExercisesRational r7 = new Ch11ExercisesRational(1, 3);
        Ch11ExercisesRational r8 = new Ch11ExercisesRational(1, 6);
        System.out.println(r7 + " + " + r8 + " = " + r7.add(r8));

        Ch11ExercisesRational r9 = new Ch11ExercisesRational(1, 2);
        Ch11ExercisesRational r10 = new Ch11ExercisesRational(1, 2);
        System.out.println(r9 + " + " + r10 + " = " + r9.add(r10));
    }
}
