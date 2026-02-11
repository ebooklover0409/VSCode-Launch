public class Multadd {
    public static double multadd(double a, double b, double c) { 
        return a * b + c; 
    }
    public static void main(String[] args) { 
        System.out.println(multadd(1.0, 2.0, 3.0)); 
        System.out.println(multadd(1, Math.sin(Math.PI/4), (Math.cos(Math.PI/4))/2)); 
        System.out.println(multadd(1, Math.log(10), Math.log(20))); 
        expSum(1.0); 
    }
    public static void expSum(double x) { 
        System.out.println(multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x))));
    }
}

