/*In class lab
Chapter 7 Arrays
Course: CSC1060
Name: Elisa Williams
Date: 2/18/2026
*/

// My 7.3 and 7.4 are switched so that 7.4 could be in the main typed out 

public class InClassCh7 {

//7.1 + 7.2 + 7.4 + 7.8 + 7.9 are in main method! 
    public static void main(String[] args) {
        //int[] stop = {};
        //printArray(stop);

       // int [] gotwice = {1, 2, 3, 4, 5};
        //System.out.println(squared(gotwice));

        //tedsting double search
        double[] array = {3.14, -55.0, 1.23, -0.8}; 
        int index = search(array, 1.23);
        System.out.println(index); 

        //testing int search 
        int[] intArray = {10, 20, 30, 40, 50};
        int intIndex = search(intArray, 30);
        System.out.println(intIndex);

        //testing sum
        double[] sumArray = {9.3, 3.7, 5.0}; 
        double total = sum(sumArray);
        System.out.println(total);
        
        //tedsting random array
        randomArray(5);

        //testing inrange 
        int[] scores = randomArray(30);

        int a = inRange(scores, 90, 100);
        System.out.println(a);
        int b = inRange(scores, 80, 90);
        System.out.println(b);
        int c2 = inRange(scores, 70, 80);   
        System.out.println(c2);
        int d = inRange(scores, 60, 70);
        System.out.println(d);
        int f = inRange(scores, 0, 60);
        System.out.println(f);

        // use for loop to do 100 counts 
        int[] loopCounter = new int[100];
        for (int i = 0; i < loopCounter.length; i++) {
         loopCounter[i] = inRange(scores, i, i + 1);
}

        //enhanement of last 
        int[] counts = new int[100];
    for (int i = 0; i < scores.length; i++) {
        int index1 = scores[i];
        counts[index1]++;
    }


         // string examples 
        String str = "apple";
    for (char c = 'a'; c <= 'z'; c++) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        if (count != 0 && count != 2) {
            System.out.println("apple is not valid");
            return;
        }
    }
    System.out.println("apple is valid");
    
    // 7.1 Creating Arrays

        //int[] counts; 
    //double[] values; 
   // counts = new int[4]; 
    //values = new double[size]; 

    double size = 3.0; 
    int[] countsFor72 = new int[4];
    double[] values3 = new double[(int)size];

    int[] why = {1, 2, 3, 4};

    // 7.2 Accessing Elements

    System.out.println("The zeroth element is " + countsFor72[0]);

    countsFor72[0] = 7;
    countsFor72[1] = countsFor72[0] * 2;
    countsFor72[2]++;
    countsFor72[3] -= 60;

    int i = 0;
    while (i < 4) {
        System.out.println(countsFor72[i]);
        //address not the content of it
        i++;
    }

    // 7.4 Array Length 

    double [] x = new double[3]; 
    double [] y = x; 
    System.out.println(y); 
    
    //7.8 Enhanced For Loop 
        int[] values = {10, 20, 30, 40, 50};
        for (int value : values) {
            System.out.println(value);
        }

        //for (double d3 : array) {
            //if (d3 == target) {
        // array contains d3, but we don't know where

        //7.9 Counting Characters 

        String s = "Hello"; 
        int[] counts2 = new int[26];
        String lower = s.toLowerCase();
        for (int k = 0; k < lower.length(); k++) {
         char letter = lower.charAt(k);
         int index20 = letter - 'a';
         counts2[index20]++;
        }

        System.out.println(isDoubloon("Mama"));  // true
        System.out.println(isDoubloon("Lama"));  // false
}

    
// 7.3 Displaying Arrays 
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
         System.out.print(", " + a[i]);
        }
        System.out.println("}");
        //sending empty list

    } 

//7.5 Traversing Arrays
    public static int squared(int[] a) {
        for (int j = 0; j < a.length; j++) {
         a[j] *= a[j];
        } 
        return a[0];  
    } 


    public static int search(double[] array, double target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
    }
    return -1;  // not found
}

    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;  // not found
    }

    public static double sum(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
 
// 7.6 Random Numbers

    public static int[] randomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        printArray(array);
        return array;
    }

// 7.7 Building Histogram 

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }


//7.9 Counting Characters 

    public static boolean isDoubloon(String s) {
        // count the number of times each letter appears
        int[] counts = new int[26];
        String lower = s.toLowerCase();
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            counts[index]++;
        }
        // determine whether the given word is a doubloon
        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }

}










    
