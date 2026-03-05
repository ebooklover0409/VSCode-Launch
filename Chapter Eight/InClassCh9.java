import java.awt.Point;
import java.awt.Rectangle;
import static java.lang.System.in;
import java.math.BigInteger;
import java.util.Scanner;

public class InClassCh9 {

// 9.1 - 9.5, 9.7, 10.1, 10.5 - 10.9, 10.10, 10.11 --> IN MAIN 
    public static void main(String[] args) { 
        
        //CHAPTER NINE

            // 9.1 
            int number = -2;
            char symbol = '!';
            char[] array = {'c', 'a', 't'};
            String word = "dog";

            //9.2 
            String name = null;
            int[] combo = null;
            //System.out.println(name.length());  // NullPointerException
            //System.out.println(combo[0]);       // NullPointerException
        
            //9.3 
            String name2 = "Alan Turing";
            String upperName = name2.toUpperCase();

            // MODIFICATION 1


            //9.4 Wrapper Case
            //Integer i = null; 
            //Integer x = Integer.valueOf(i);
            //Integer y = Integer.valueOf(i);
            Integer x = Integer.valueOf(123);
            Integer y = Integer.valueOf(123);
    
            if (x == y) {                     // false
                System.out.println("x and y are the same object");
            }
            if (x.equals(y)) {                // true
                System.out.println("x and y have the same value");
            }

            //9.5 Command Line Arguments 
            int max = Integer.MIN_VALUE;
            for (String arg : args) {
                int value = Integer.parseInt(arg);
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("The max is " + max);

            //MODIFICATION TWO SCREENSHOTTED

            //9.6 Testing
                        System.out.println(countParentheses("(())")); // 0
                        System.out.println(countParentheses("(((")); // 3
                        System.out.println(countParentheses("())")); // -1
                        System.out.println(countParentheses("")); // 0
                        System.out.println(countParentheses("()()()")); // 0

            
           
            
            //9.7 BigInteger Arithmetic 
            long hi = 17;
            BigInteger big = BigInteger.valueOf(hi);
            BigInteger a = BigInteger.valueOf(17);
            BigInteger b = BigInteger.valueOf(1700000000);
            BigInteger c = a.add(b);


        // CHAPTER TEN
            //10.1 
            Point blank;
            blank = new Point(3, 4);
            System.out.println(blank.x + ", " + blank.y);
            int sum = blank.x * blank.x + blank.y * blank.y;
            
            //10.4 Test
            Rectangle box = new Rectangle(0, 0, 100, 200);
            moveRect(box, 50, 100);  // now at (50, 100, 100, 200)
            box.translate(50, 100);

                    //10.5 Aliasing Revisited
                    box.grow(50, 50);                // grow box1 (alias)
                    
                    //10.9 Garbage Collection
                    Point blank2 = new Point(3, 4); 
        
                    //10.10 Mutable VS Immutable 
                    String s1 = "Hi, Mom!";
                    String s2 = "Hi, " + "Mom!";
                    if (s1.equals(s2)) {         
                        System.out.println("s1 and s2 are the same");
                    }

            //10.11 StringBUilder Objects

            Scanner scanner = new Scanner(in);
            String text = "";
            for (int j = 0; j < 10; j++) {
                String line = scanner.nextLine();        // new string
                text = text + line + '\n';    // two more strings
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

            }


            //9.6 Argument Validation
            public static boolean isCapitalized(String str) {
                return Character.isUpperCase(str.charAt(0));
            }

            public static boolean isCapitalized2(String str) {
            if (str == null || str.isEmpty()) {
                return false;
            }
            return Character.isUpperCase(str.charAt(0));
            }

             //9.6 MODIFICATION 3: 


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


            //9.8 Incremental Design
            public static void printRow() {
            for (int i = 1; i <= 6; i++) {
                System.out.printf("%4d", 2 * i);
            }
            System.out.println();
            }

            public static void printRow1(int n) {
            for (int i = 1; i <= 6; i++) {
                System.out.printf("%4d", n * i);  // generalized n
            }
            System.out.println();
            }

            //9.9 More Generalization
            public static void printTable() {
            for (int i = 1; i <= 6; i++) {
                printRow1(i);
            }
            }

            public static void printTable(int rows) {
            for (int i = 1; i <= rows; i++) {     // generalized rows
                printRow1(i);
            }
        }

            //10.2 
            public static void printPoint(Point p) {
            System.out.println("(" + p.x + ", " + p.y + ")");
            }

            public static double distance(Point p1, Point p2) {
            int dx = p2.x - p1.x;
            int dy = p2.y - p1.y;
            return Math.sqrt(dx * dx + dy * dy);
            }
    
            //10.3 Objects as Return Values
            Rectangle box = new Rectangle(0, 0, 100, 200);

            public static Point findCenter(Rectangle box) {
                int x = box.x + box.width / 2;
                int y = box.y + box.height / 2;
                return new Point(x, y);
}
        
            //10.4 Rectangles Are Mutable
            Rectangle box2 = new Rectangle(0, 0, 100, 200);
            public static void moveRect(Rectangle box, int dx, int dy) {
                box.x = box.x + dx;
                box.y = box.y + dy;
            }

        
    }


//11.1
//public class Time {
   // private int hour;
    //private int minute;
    //private double second;
//}

//11.2 
//public Time() {
    //this.hour = 0;
    //this.minute = 0;
    //this.second = 0.0;
//}
//public static void main(String[] args) {
    //Time time = new Time();
//}

//11.3 
   // public Time(int hour, int minute, double second) {
     //   this.hour = hour;
       // this.minute = minute;
   //     this.second = second;
    //}
    //Time time = new Time(11, 59, 59.9);
    //public class Time {
      //  private int hour;
       //private int minute;
        //private double second;
       // public Time() {
         //   this.hour = 0;
           // this.minute = 0;
          //  this.second = 0.0;
       // }
       // public Time(int hour, int minute, double second) {
         //   this.hour = hour;
         //   this.minute = minute;
         //   this.second = second;
        //}
    //}

//11.4 
        //public class TimeClient {
          //  public static void main(String[] args) {
            //    Time time = new Time(11, 59, 59.9);
              //  System.out.println(time.hour);      // compiler error
            //}
        //}
        //public int getHour() {
          //  return this.hour;
        //}
        //public int getMinute() {
         //   return this.minute;
        //}//public double getSecond() {
          //  return this.second;
        //} //System.out.println(time.getHour());//public void setHour(int hour) {
          //  this.hour = hour;
        //}//public void setMinute(int minute) {
          //  this.minute = minute;
        //}//public void setSecond(double second) {
          //  this.second = second;
        //}

//11.5
    //public static void printTime(Time t) {
      //  System.out.print(t.hour);
      //  System.out.print(":");
      //  System.out.print(t.minute);
      //  System.out.print(":");
      //  System.out.println(t.second);
    //}public static void printTime(Time t) {
     //   System.out.printf("%02d:%02d:%04.1f\n",
       //     t.hour, t.minute, t.second);
    //}

//11.6
   // public static void main(String[] args) {
     //   Time time = new Time(11, 59, 59.9);
     //   System.out.println(time);
   // }
   // public String toString() {
    //    return String.format("%02d:%02d:%04.1f\n",
    //        this.hour, this.minute, this.second);
   // }
    //Time time = new Time(11, 59, 59.9);
   // String s = time.toString();
    //System.out.println(time);

//11.7
    //public boolean equals(Time that) {
      //  final double DELTA = 0.001;
      //  return this.hour == that.hour
    //     && this.minute == that.minute
     //       && Math.abs(this.second - that.second) < DELTA;
    //}time1.equals(time3);

//11.8 
//Time startTime = new Time(18, 50, 0.0);
    //Time runningTime = new Time(2, 16, 0.0); public static Time add(Time t1, Time t2) {
    //    Time sum = new Time();
    //    sum.hour = t1.hour + t2.hour;
    //    sum.minute = t1.minute + t2.minute;
    //    sum.second = t1.second + t2.second;
    //    return sum;
    //}
    //Time endTime = Time.add(startTime, runningTime);public Time add(Time t2) {
    //    Time sum = new Time();
    //    sum.hour = this.hour + t2.hour;
    //    sum.minute = this.minute + t2.minute;
    //    sum.second = this.second + t2.second;
    //    return sum;
    //} Time endTime = startTime.add(runningTime);public Time add(Time t2) {
    //    Time sum = new Time();
    //    sum.hour = this.hour + t2.hour;
    //    sum.minute = this.minute + t2.minute;
    //    sum.second = this.second + t2.second; if (sum.second >= 60.0) {
    //        sum.second -= 60.0;
     //       sum.minute += 1;
     //   } if (sum.minute >= 60) {
      //      sum.minute -= 60;
       //     sum.hour += 1;
       // }if (sum.hour >= 24) {
        //    sum.hour -= 24;
        //} return sum;


        /// MODIFICATION THREE
        /// 
        /// 
        // // Exercise 11.3. 
  //  private int year;
  //  private int month;
  //  private int day;

    // Default constructor
  //  public Date() {
  //      this.year = 1970;
    //   this.month = 1;
    //    this.day = 1;
    //}

    // Constructor with parameters
    //public Date(int year, int month, int day) {
    //    this.year = year;
    //    this.month = month;
    //    this.day = day;
    //}

    //public static void main(String[] args) {
     //   Date birthday = new Date(1990, 5, 15);
      //  System.out.println("Birthday: " + birthday.month + "/" + birthday.day + "/" + birthday.year);
    //}/
//}

