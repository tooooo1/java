package chap15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CounterTest extends JFrame implements ActionListener {
    private JLabel label, label1;
    private JButton button, button1, button2;
    private int count = 0;

    public CounterTest() {
        JPanel panel = new JPanel();
        label = new JLabel("Counter");
        panel.add(label);

        label1 = new JLabel("" + count);
        label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
        panel.add(label1);

        JPanel panel_b = new JPanel();
        button = new JButton("카운터 증가");
        button1 = new JButton("카운터 감소");
        button2 = new JButton("카운터 초기화");
        panel_b.add(button);
        panel_b.add(button1);
        panel_b.add(button2);
        panel.add(panel_b);
        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(panel);
        setSize(300, 200);
        setTitle("My Counter");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button) {
            count++;
            label1.setText(count + "");
        } else if (event.getSource() == button1) {
            count--;
            label1.setText(count + "");
        } else {
            count = 0;
            label1.setText(count + "");
        }
    }
}

public class Four {
    public static void main(String args[]) {
        new CounterTest();
    }
}
