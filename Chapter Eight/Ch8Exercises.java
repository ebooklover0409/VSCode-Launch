public class Ch8Exercises{ 
    
    public static void main(String[] args) { 
        int verses = 10; 
        Bottles(verses);
        int n = 5;
        System.out.println("The sum of the first " + n + " odd numbers is: " + oddSum(n));
        System.out.println(prod(1,4)); 
        System.out.println(ack(2, 3));
        System.out.println(power(2, -3));
        int[] array = {3, 1, 4, 1, 5, 9};
        System.out.println("The maximum value in the array is: " + maxInRange(array
, 0, array.length - 1));
        String s = "noon";
        System.out.println("The first character of the string is: " + first(s));
        System.out.println("All but the first letter of the string is: " + rest(s));
        System.out.println("All but the first and last letter of the string is: " + middle(s));
        System.out.println("The length of the string is: " + length(s));
        System.out.println("The letters of the string one on each line:");
        display(s);
        System.out.println("The string in reverse order is: " + reverse(s));
        System.out.println("Is the string a palindrome? " + isPalindrome(s));
    }

    //8.1 

    public static int Bottles(int verses) { 
         if (verses >=1) { 
            System.out.println(verses + " bottles of beer on the wall, " + verses + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (verses - 1) + " bottles of beer on the wall.");
            return Bottles(verses - 1);
        } else { 
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.println("ya' can't take one down, ya' can't pass it around, 'cause there are no more bottles of beer on the wall!");
            return 0;
    }
    }  
    
    //8.2 

    public static int oddSum(int n) { 
        if (n <= 0) { 
            return 0;
        } else if (n % 2 == 1) { 
            return n + oddSum(n - 2);
        } else { 
            return oddSum(n - 1);
        }
    }

    //8.3 


    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }

    /**
     * runs through prod by multiplying n by the result of prod(m, n - 1) until m and n are equal, at which point it returns n.
     * m = 1, n = 4, m = 1, n=3, etc. until m = 1, n = 1, at which point it returns 1. Then it multiplies back up: 2 * 1 = 2, 3 * 2 = 6, and finally 4 * 6 = 24.
     */

// 8. 4

    public static int ack(int s, int t) { 
        if (s == 0) { 
            return t + 1;
        } else if (t == 0) { 
            return ack(s - 1, 1);
        } else { 
            return ack(s - 1, ack(s, t - 1));
        }
    }

    //8.5 

    public static double power(double x, int n) { 
        if (n == 0) { 
            return 1;
        } else if (n > 0) { 
            return x * power(x, n - 1);
        } else { 
            return 1 / power(x, -n);
        }
    }

    //8.6 

    public static int maxInRange(int[] array, int LowIndex, int highIndex) { 
        if (LowIndex == highIndex) { 
            return array[LowIndex];
        } else { 
            int mid = (LowIndex + highIndex) / 2;
            int max1 = maxInRange(array, LowIndex, mid);
            int max2 = maxInRange(array, mid + 1, highIndex);
            return Math.max(max1, max2);
        }
    }

    //8.7 

        
     // returns the first character of the given string
    public static char first(String s) {
        return s.charAt(0);
    }

    //Returns all but the first letter of the given String.
    public static String rest(String s) {
        return s.substring(1);
    }

    //Returns all but the first and last letter of the String.
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    // Returns the length of the given String.
    public static int length(String s) {
        return s.length();
    }

    //displays letters of the string one on each line
    public static void display(String s) {
        if (s.length() > 0) {
            System.out.println(first(s));
            display(rest(s));
        }
    }

    //returns string in reverse order
    public static String reverse(String s) {
        if (s.length() == 0) {
            return s;
        } else {
            return reverse(rest(s)) + first(s);
        }
    }

    //tests if palindrome
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (first(s) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return isPalindrome(middle(s));
        }
    }

}