
package ChapNine;

import java.math.BigInteger;

public class Ch9Exercises {
    
    public static void main(String[] args) { 
        
        //9.1 

        String one = "hi"; 
        int n = 3; 
        double x = 2.0; 
        boolean flag = true; 
        char y = 'g'; 

        System.out.println(n); 

        //System.out.println(y = y + 1);
        
        // 9.2 
            System.out.println("Big Integer Use");
            System.out.printf("%-5s %s%n", "n", "n!");
            for (int i = 0; i <= 30; i++) {
                System.out.printf("%-5d %s%n", i, factorialBig(i));
        }

        // 9.4 call 
        for (double i = 0.1; i <=100.0;){
            check(i);
            i *= 10; 
        }

        for (double i = -0.1; i >= -100;) { 
            check(i); 
            i *= 10; 
        }
        int num = 4; 
        check(num); 

        // 9.6 call
                        System.out.println(countParentheses("(())")); // 0
                        System.out.println(countParentheses("(((")); // 3
                        System.out.println(countParentheses("())")); // -1
                        System.out.println(countParentheses("")); // 0
                        System.out.println(countParentheses("()()()")); // 0


    }

    // 9.2 

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static BigInteger factorialBig(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // 9.3 

    public static BigInteger pow(int x, int n) {
    if (n == 0) return BigInteger.ONE;

    // find x to the n/2 recursively
    BigInteger t = pow(x, n / 2);

    // if n is even, the result is t squared
    // if n is odd, the result is t squared times x
    if (n % 2 == 0) {
        return t.multiply(t);
    } else {
        return t.multiply(t).multiply(BigInteger.valueOf(x));
    }
    }


    // 9.4 

    public static int myexpOrg(int x, int n) { 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return sum;
    }

    public static int myexp(double x, int n) { 
        int sum = 0; 
        int numerator = 1; 
        int denominator = 1; 

        for (int i = 0; i < n; i++) { 
            sum += numerator/denominator; 
            numerator *= x; 
            denominator *= (i + 1); 
        } 
        return sum; 
    }

    public static void check(double x) { 
        int terms = 5; 
        System.out.println(x + "\t" + myexp(x,terms) + "\t" + Math.exp(x)); 


    }

    // 9.5 

    public static double[] powArray(double a [], double power){ 
        double [] result = new double[a.length]; 
        for (int i = 0; i < a.length; i++) { 
            result[i] = Math.pow(a[i], power); 
        }
        return result; 
    }

    public static int[] histogram(int[] scores, int nums) {
        int[] counts = new int[nums];
        for (int score : scores) {
            if (score >= 0 && score < nums) {
                counts[score]++;
            }
        }
        return counts;
    }

    // 9.6 

    public static int countParentheses(String s) {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == '(') {
                        count++;
                    } else if (c == ')') {
                        count--;
                    }
                }
                return count;
            }

}




