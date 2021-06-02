package chap16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class One extends JFrame {
    class CustomPanel extends JPanel {
        public CustomPanel() {
            setBorder(new LineBorder(Color.RED, 1));
        }
        public void paintComponent(Graphics g) {
            g.drawRect(10, 10, 210, 50);
            g.fillOval(100, 25, 20, 20);
        }
    }
    public One() {
        setTitle("원과 사각형");
        CustomPanel customPanel = new CustomPanel();
        add(customPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 120);
        setVisible(true);
    }
    public static void main(String[] args) {
        new One();
    }
}