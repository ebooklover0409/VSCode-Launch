package ChapterTwo;
public class Time {
    public static void main(String[] args) {
        int hour = 14; 
        int minute = 35; 
        int second = 43; 

        // seconds since midnight 
        int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        // remaining seconds in the day 
        int remainingSeconds = 86400 - secondsSinceMidnight;
        System.out.println("Remaining seconds in the day: " + remainingSeconds);

        //percentage of the day that has passed
        double percentageOfDayPassed = (secondsSinceMidnight / 86400.0) * 100; 
        System.out.println("Percentage of the day that has passed: " + percentageOfDayPassed);

        // reflect time since started workings 
        int currenthour = 14;
        int currentminute = 50; 
        int currentsecond = 28;
        int secondsSinceWorkStarted = ((currenthour - 14) * 3600) + ((currentminute - minute) * 60) + currentsecond;
        System.out.println("Seconds since work started: " + secondsSinceWorkStarted);
    }
}

