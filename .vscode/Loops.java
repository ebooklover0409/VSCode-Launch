import java.util.Scanner; 

public class Loops {

    
    public static void main(String[] args) {
        int n = 10; 
        System.out.println(SumOfForNumbers(n)); 
        System.out.println(SumOfWhileNumbers(n));
        ForFibonacci(n);
        System.out.println(); 
        WhileFibonacci(n);
        System.out.println();  
        RightAngleLoop(n); 

    }

    public static int SumOfForNumbers(int n) { 
        int sum = 0; 
        for (int i = 1; i <= n; i++) { 
            sum += i; 
        }
        return sum;
    }

    public static int SumOfWhileNumbers(int n) { 
        int sum = 0; 
        int i = 1; 
        while (i <= n) { 
            sum += i; 
            i++; 
        }
        return sum;
    }
        
    
    public static int ForFibonacci(int n) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number of Fibonacci terms to display: ");
        n = in.nextInt();
            if (n <= 0) {
                System.out.println("No terms to display.");
                return 0;
            }
            long a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print(a);
                } else if (i == 1) {
                    System.out.print(" " + b);
                } else {
                    long c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }
            }
            return 0;
        }

        public static int WhileFibonacci(int n) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number of Fibonacci terms to display: "); 
        n = in.nextInt(); 

        if (n <= 0) { 
            System.out.print("No terms to display."); 
            return 0; 
        }
        else if (n == 1) { 
            System.out.print("0"); 
            return 0; 
        }
        else {
            long a = 0, b = 1; 
            int count = 2; 
            System.out.print(a + " " + b); 
            while (count < n) {
                long c = a + b; 
                System.out.print(" " + c); 
                a = b; 
                b = c; 
                count++; 
            }
            return 0;
        }
    
        }

        public static int RightAngleLoop(int n) { 
            Scanner in = new Scanner(System.in); 
            System.out.print("Enter the number of rows for the triangle: "); 
            n = in.nextInt(); 
            if (n <= 0) {
                System.out.println("No terms."); 
                return 0; 
            }
            else { 
                for (int i = 1; i <= n; i++) {
                    int count = 1;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(count + " ");
                        count++;
                    }
                    System.out.println();
                }

        return 0; } 
        
            }
        }
    

   
    

    