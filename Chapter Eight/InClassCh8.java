public class InClassCh8 {

    public static void main(String[] args) {
        countdown(3); 
        nLines(3);
        //forever("stop"); this one will continue forever
        System.out.println(factorial3(3)); 
        System.out.println(fibonacci(3)); 
        countup(10); 
        displayBinary(23); 
    }

    // 8.1 Recursive Void Methods 

    public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
    }

    public static void newLine() {
    System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void nLines(int n) {
    if (n > 0) {
        System.out.println();
        nLines(n - 1);
    }
    }

    // 8.2 Recursive Stack Diagrams 
    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    // 8.3 Value-Returning Methods 

    public static int factorial(int n) {
    return 0;  // stub
    }

    public static int factorial2(int n) {
    if (n == 0) {
        return 1;
    }
    return 0; //stub 
    }

    public static int factorial3(int n) {
    if (n == 0) {
        return 1;
    }
    int recurse = factorial3(n - 1);
    int result = n * recurse;
    return result;
    }

    // 8.4 The Leap of Faith 
    public static boolean isSingleDigit(int x) {
    return x > -10 && x < 10;
    }

    public static int factorial4(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial4(n - 1);
    }

    public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 8.5 Counting Up Recursively 

    public static void countup(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        countup(n - 1);
        System.out.println(n);
    }
    }

    // 8.6 Binary Number System
    // using recursive because use remainder for binary and then use quotient to call itself again
    // that is how bihary works by dividing by 2

    //8.7 Recursive Binary Method 

    public static void displayBinary(int value) {
    if (value > 0) {
        displayBinary(value / 2);
        System.out.print(value % 2);
    }
    }

    //8.8 Coding Bat Problems! 

}