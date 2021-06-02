package chap15;

import javax.swing.*;
import java.awt.*;

public class One extends JFrame {
    public One() {
        setTitle("배경색 바꾸기");
        JButton bt = new JButton("클릭");
        JPanel panel = new JPanel();
        panel.add(bt);
        add(panel);
        bt.addActionListener(e -> {
            if(panel.getBackground()== Color.YELLOW)
                panel.setBackground(null);
            else
                panel.setBackground(Color.YELLOW);
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new One();
    }
}
