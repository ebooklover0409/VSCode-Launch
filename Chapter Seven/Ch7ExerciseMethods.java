public class Ch7ExerciseMethods {
    
    //main

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}; 
        
        //call 7.3 
        int maxIndex = indexOfMax(a);
        System.out.println("The index of the maximum value is: " + maxIndex);

        //call 7.4 

        int numberOfPrimes = sieve(10); 
        System.out.println("The number of primes less than or equal to 10 is: " + numberOfPrimes);
        
        //call 7.5
        boolean areTheyFactors = areFactors(a, 2); 
        System.out.println("Are they factors? " + areTheyFactors);

        //call 7.6 
        boolean areTheyPrimeFactors = arePrimeFactors(a, 2); 
        System.out.println("Are they prime factors? " + areTheyPrimeFactors);

        //call 7.7 
        String one = "apples"; 
        int[] histogram = letterHist(one); 
        System.out.println("letter history for " + one + "is: " + java.util.Arrays.toString(histogram)); 

        //call 7.8
        String a1 = "listen";
        String b1 = "silent";
        boolean anagramResult = isAnagram(a1, b1);
        System.out.println(a1 + " and " + b1 + " are anagrams: " + anagramResult);
    }


    // 7.3 


    public static int indexOfMax(int[] a) { 

        int maxIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // this was written with the for loop! 

    // 7.4 

    public static int sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    // 7.5 

    public static boolean areFactors(int[] a, int n) { 
        
        for (int i = 0; i<a.length; i++) { 
            if (n % a[i] != 0) {
                return false; 
            }
        }
        return true;
    }

    // 7.6 

    public static boolean arePrimeFactors(int[] a, int n) {

        for(int i = 0; i < a.length; i++) { 
            if (n % a[i] != 0) { 
                return false; 
            }
        } 
        return true; 
    }

    //7.7 

    public static int[] letterHist(String s) {
        int[] histogram = new int[26];
        for (char c : s.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if (lower >= 'a' && lower <= 'z') {
                histogram[lower - 'a']++;
            }
        }
        return histogram;
    }

    // 7.8 

    public static boolean isAnagram(String a, String b) { 
        int [] histA = letterHist(a);
        int [] histB = letterHist(b);
        if (histA.length != histB.length) {
            return false; 
        }
        for (int i = 0; i < histA.length; i++) { 
            if (histA[i] != histB[i]) {
                return false; 
            }
        }
        return true;
    }
}
