/*In class lab
Graphics
Course: CSC1060
Name: Elisa Williams
Date: 3/23/26
*/

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame; 

public class Drawing extends Canvas { 

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing drawing = new Drawing();
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
        mickey(g, new Rectangle(100, 100, 200, 200));
    }

        /**
     * Fills an oval bounded by the specified rectangle with
     * the current color.
     */

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
     }

    public void mickey(Graphics g, Rectangle bb) {
        boxOval(g, bb);

        int hx = bb.width / 2;
        int hy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, hx, hy);

        half.translate(-hx / 2, -hy / 2);
        boxOval(g, half);

        half.translate(hx * 2, 0);
        boxOval(g, half);
    }
}
