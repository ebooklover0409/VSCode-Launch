import java.util.Scanner; 
public class CircleCalculation { 
    public static void diameter(double radius) { 
        double diameter = 2 * radius; 
        System.out.println("Diameter: " + diameter); 
    }
    public static void area(double radius) {  mm
        double area = Math.PI * radius * radius; 
        System.out.println("Area: " + area); 
    }
    public static void circumference(double radius) { 
        double circumference = 2 * Math.PI * radius; 
        System.out.println("Circumference: " + circumference);
    }
    public static void main(String[] args) { 
        Scanner in = new java.util.Scanner(System.in); 
        System.out.print("Enter the radius of the circle: "); 
        double radius = in.nextDouble(); 
        diameter(radius); 
        area(radius); 
        circumference(radius); 
    }
}