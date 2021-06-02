package chap16;

import java.awt.*;
import javax.swing.*;
public class Four extends JFrame {
    public Four() {
        setTitle("얼굴");
        add(new CustomPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 260);
        setVisible(true);
    }
    class CustomPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.orange);
            g.fillOval(10, 10, 200, 200);
            g.setColor(Color.black);
            g.drawOval(10, 10, 200, 200);
            g.setColor(Color.white);
            g.fillOval(35, 35, 30, 50);
            g.setColor(Color.black);
            g.drawOval(35, 35, 30, 50);
            g.setColor(Color.black);
            g.fillOval(40, 40, 15, 25);
            g.setColor(Color.white);
            g.fillOval(110, 35, 30, 50);
            g.setColor(Color.black);
            g.drawOval(110, 35, 30, 50);
            g.setColor(Color.black);
            g.fillOval(115, 40, 15, 25);
            g.setColor(Color.orange.brighter());
            g.fillOval(66, 76, 30, 25);
            g.setColor(Color.black);
            g.fillOval(66, 76, 30, 25);
            g.setColor(Color.red);
            g.fillArc(30, 110, 140, 30, 0, -180);
        }
    }
    public static void main(String[] args) {
        new Four();
    }
}