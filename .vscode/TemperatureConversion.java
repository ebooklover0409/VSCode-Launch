import java.util.Scanner;

public class TemperatureConversion {
   
    public static void main(String[] args){

    Scanner in = new Scanner(System.in); 
    double enteredTemp; 

    //ask user for temperature in Celsius
    System.out.print("Enter a Celsius temperature: "); 
    enteredTemp = in.nextDouble(); 
    
    //convert Celcsius to Farenheit 
    int multipliedTemp; 
    double farenheitTemp; 
        multipliedTemp = enteredTemp * 9/5; 
        farenheitTemp = multipliedTemp + 32; 
        System.out.println(enteredTemp +"°C" + " = " +farenheitTemp + "°F");

    //convert Farenheit to Kelvin 
    double addTemp;
    double kelvinTemp; 
        addTemp = farenheitTemp + 459.67; 
        kelvinTemp = addTemp * 5/9; 
        System.out.println("The temperature in Kelvin is: " + kelvinTemp + "K" ); 

    }
}