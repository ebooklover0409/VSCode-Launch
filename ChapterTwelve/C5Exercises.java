package ChapterTwelve;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame; 

public class C5Exercises extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        C5Exercises drawing = new C5Exercises();
        drawing.setSize(400, 400);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    
    }

    
    public void fillOval(int x, int y, int width, int height) {
        Color purple = new Color(128, 0, 128);
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }

        /**
     * Fills an oval bounded by the specified rectangle with
     * the current color.
     */

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
     }
    
     
}
