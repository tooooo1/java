package chap16;

import java.awt.*;
import javax.swing.*;
public class Two extends JFrame {
    public Two() {
        setTitle("동심원 무지개");
        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Color[] c = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, new Color(0x00080),
                        new Color(0x800080) };
                for (int i = 0; i < 7; i++) {
                    int d = delta(i);
                    g.setColor(c[i]);
                    g.drawOval(10 + d, 10 + d, 240 - d * 2, 240 - d * 2);
                }
            }
        }
        add(new MyPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    int delta(int x) {
        double diagonal = Math.sqrt(240 * 240);
        return (int) (diagonal * 15 * x / 240);
    }
    public static void main(String[] args) {
        new Two();
    }
}