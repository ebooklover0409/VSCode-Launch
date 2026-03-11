import java.awt.Point;
import java.awt.Rectangle;
import static java.lang.System.in;
import java.math.BigInteger;
import java.util.Scanner;

public class InClassCh9 {

    //
    public static void main(String[] args) {

        // CHAPTER NINE

        // 9.1
        int number = -2;
        char symbol = '!';
        char[] array = {'c', 'a', 't'};
        String word = "dog";

        // 9.2
        String name = null;
        int[] combo = null;
        // System.out.println(name.length());  // NullPointerException
        // System.out.println(combo[0]);        // NullPointerException

        // 9.3
        String name2 = "Alan Turing";
        String upperName = name2.toUpperCase();

        // 9.4 Wrapper Case
        Integer x = Integer.valueOf(123);
        Integer y = Integer.valueOf(123);

        if (x == y) {
            System.out.println("x and y are the same object");
        }
        if (x.equals(y)) {
            System.out.println("x and y have the same value");
        }

        // 9.5 Command Line Arguments
        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);

        // 9.6 Testing countParentheses
        System.out.println(countParentheses("(())"));   // 0
        System.out.println(countParentheses("((("));    // 3
        System.out.println(countParentheses("())"));    // -1
        System.out.println(countParentheses(""));       // 0
        System.out.println(countParentheses("()()()")); // 0

        // 9.7 BigInteger Arithmetic
        long hi = 17;
        BigInteger big = BigInteger.valueOf(hi);
        BigInteger a = BigInteger.valueOf(17);
        BigInteger b = BigInteger.valueOf(1700000000);
        BigInteger c = a.add(b);

        // CHAPTER TEN

        // 10.1
        Point blank;
        blank = new Point(3, 4);
        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;

        // 10.4 Test
        Rectangle box = new Rectangle(0, 0, 100, 200);
        moveRect(box, 50, 100);
        box.translate(50, 100);

        // 10.5 Aliasing Revisited
        box.grow(50, 50);

        // 10.9 Garbage Collection
        Point blank2 = new Point(3, 4);

        // 10.10 Mutable vs Immutable
        String s1 = "Hi, Mom!";
        String s2 = "Hi, " + "Mom!";
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are the same");
        }

        // 10.3 findCenter test
        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Point center = findCenter(box1);
        printPoint(center);

        // 10.11 StringBuilder Objects
        Scanner scanner = new Scanner(in);

        String text = "";
        for (int j = 0; j < 10; j++) {
            String line = scanner.nextLine();
            text = text + line + '\n';
        }
        System.out.print("You entered:\n" + text);

        StringBuilder text1 = new StringBuilder();
        for (int k = 0; k < 10; k++) {
            String line = scanner.nextLine();
            text1.append(line);
            text1.append('\n');
        }
        System.out.print("You entered:\n" + text1);

        String result = text1.toString();
        scanner.close();

        // CHAPTER ELEVEN

        // 11.1 / 11.2 Default Time
        Time time = new Time();
        System.out.println(time);

        // 11.3 Parameterized Time
        Time time2 = new Time(11, 59, 59.9);
        System.out.println(time2);

        // 11.4 Getters
        System.out.println(time2.getHour());

        // 11.5 printTime
        Time.printTime(time2);

        // 11.6 toString via println
        System.out.println(time2);

        // 11.7 equals
        Time time3 = new Time(11, 59, 59.9);
        System.out.println(time2.equals(time3)); // true

        // 11.8 add
        Time startTime   = new Time(18, 50, 0.0);
        Time runningTime = new Time(2, 16, 0.0);
        Time endTime     = startTime.add(runningTime);
        System.out.println(endTime);

        // Exercise 11.3 — Date
        Date birthday = new Date(1990, 5, 15);
        System.out.println("Birthday: " + birthday);
    }

    // 

    // 9.6 Argument Validation
    public static boolean isCapitalized(String str) {
        return Character.isUpperCase(str.charAt(0));
    }

    public static boolean isCapitalized2(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return Character.isUpperCase(str.charAt(0));
    }

    // 9.6 countParentheses
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

    // 9.8 Incremental Design
    public static void printRow() {
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%4d", 2 * i);
        }
        System.out.println();
    }

    public static void printRow1(int n) {
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%4d", n * i);
        }
        System.out.println();
    }

    // 9.9 More Generalization
    public static void printTable() {
        for (int i = 1; i <= 6; i++) {
            printRow1(i);
        }
    }

    public static void printTable(int rows) {
        for (int i = 1; i <= rows; i++) {
            printRow1(i);
        }
    }

    // 10.2
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 10.3 Objects as Return Values
    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width  / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    // 10.4 Rectangles Are Mutable
    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    // 

    // 11.1 / 11.2 / 11.3 / 11.4 / 11.5 / 11.6 / 11.7 / 11.8
    static class Time {
        private int hour;
        private int minute;
        private double second;

        // 11.2 Default constructor
        public Time() {
            this.hour = 0;
            this.minute = 0;
            this.second = 0.0;
        }

        // 11.3 Parameterized constructor
        public Time(int hour, int minute, double second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        // 11.4 Getters
        public int getHour()      { return this.hour; }
        public int getMinute()    { return this.minute; }
        public double getSecond() { return this.second; }

        // 11.4 Setters
        public void setHour(int hour)       { this.hour = hour; }
        public void setMinute(int minute)   { this.minute = minute; }
        public void setSecond(double second){ this.second = second; }

        // 11.5 printTime
        public static void printTime(Time t) {
            System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
        }

        // 11.6 toString
        public String toString() {
            return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.second);
        }

        // 11.7 equals
        public boolean equals(Time that) {
            final double DELTA = 0.001;
            return this.hour == that.hour
                && this.minute == that.minute
                && Math.abs(this.second - that.second) < DELTA;
        }

        // 11.8 add (instance method)
        public Time add(Time t2) {
            Time sum = new Time();
            sum.hour   = this.hour   + t2.hour;
            sum.minute = this.minute + t2.minute;
            sum.second = this.second + t2.second;

            if (sum.second >= 60.0) {
                sum.second -= 60.0;
                sum.minute += 1;
            }
            if (sum.minute >= 60) {
                sum.minute -= 60;
                sum.hour   += 1;
            }
            if (sum.hour >= 24) {
                sum.hour -= 24;
            }
            return sum;
        }
    }

    // Exercise 11.3 — Date class
    static class Date {
        private int year;
        private int month;
        private int day;

        // Default constructor
        public Date() {
            this.year  = 1970;
            this.month = 1;
            this.day   = 1;
        }

        // Parameterized constructor
        public Date(int year, int month, int day) {
            this.year  = year;
            this.month = month;
            this.day   = day;
        }

        // toString
        public String toString() {
            return String.format("%02d/%02d/%04d", this.month, this.day, this.year);
        }
    }
}