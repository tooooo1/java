package chap14;

import javax.swing.*;
import java.awt.*;

public class Five extends JFrame {
    Five() {
        setTitle("난수 알파벳");
        setSize(300,200);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        setVisible(true);

        JLabel a = new JLabel("a");
        JLabel b = new JLabel("b");
        JLabel c = new JLabel("c");
        JLabel d = new JLabel("d");
        JLabel e = new JLabel("e");
        JLabel f = new JLabel("f");
        JLabel g = new JLabel("g");

        panel.add(a);
        panel.add(b);
        panel.add(c);
        panel.add(d);
        panel.add(e);
        panel.add(f);
        panel.add(g);
        a.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);
        b.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);
        c.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);
        d.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);
        e.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);
        f.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);
        g.setBounds((int)(Math.random()*100),(int)(Math.random()*100),10,10);

        add(panel,BorderLayout.CENTER);

    }
    public static void main(String[] args) {
        new Five();

    }
}
