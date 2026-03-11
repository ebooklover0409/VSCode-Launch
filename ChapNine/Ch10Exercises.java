package ChapNine; 

import java.awt.Point; 
import java.awt.Rectangle; 

public class Ch10Exercises { 

    public static void main(String[] args) { 
        int x = 5;
        Point blank = new Point(1, 2);

        System.out.println(riddle(x, blank));
        System.out.println(x);
        System.out.println(blank.x);
        System.out.println(blank.y);

        // 10.2 

        Point blank1 = new Point(5, 8);

        Rectangle rect = new Rectangle(0, 2, 4, 4);
        Point center = findCenter(rect);

        double dist = distance(center, blank);
        System.out.println(dist);
        
        // 10.3 

        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);

        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
        
    }

    // 10.1 

    public static int riddle(int x, Point p) {
        x = x + 7;
        return x + p.x + p.y;
    }

    //10.2 
    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y); 
    }

    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //10.3 
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    
}
