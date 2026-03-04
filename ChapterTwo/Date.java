package ChapterTwo;

public class Date {
    
    public static void printAmerican(String day, String month, int year, int date) {
        System.out.print("American format: "); 
        System.out.print(day + ", " + month + " " + date + ", " + year); 
    }

    public static void printEuropean(String day, int date, String month, int year) { 
        System.out.print("\nEuropean format: "); 
        System.out.print(day + " " + date + " " + month + " " + year);
    }
    public static void main(String[] args) {
        String day  = "Thursday";
        String month = "July"; 
        int date = 18; 
        int year = 2026; 
        printAmerican(day, month, year, date); 
        printEuropean(day, date, month, year);
        System.out.println(args[0]); 
    }
    
    }


