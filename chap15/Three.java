package chap15;

import javax.swing.*;
import java.awt.*;

public class Three extends JFrame{
    public Three() {
        setTitle("섭씨->화씨 변환");

        JPanel p1 = new JPanel();
        JLabel cLabel = new JLabel("섭씨", JLabel.LEFT);
        JTextField cTemp = new JTextField(10);
        p1.add(cLabel);
        p1.add(cTemp);

        JPanel p2 = new JPanel();
        JLabel fLabel = new JLabel("화씨", JLabel.LEFT);
        JTextField fTemp = new JTextField(10);
        fTemp.setEditable(false);
        p2.add(fLabel);
        p2.add(fTemp);

        JPanel p3 = new JPanel();
        JButton b = new JButton("변환");
        p3.add(b);

        b.addActionListener(e -> {
            if(cTemp.getText().isEmpty())
                fTemp.setText("??????");
            else {
                String s = cTemp.getText();
                double c = Double.parseDouble(s);
                double f = c * 9.0 / 5.0 + 32;
                fTemp.setText("" + f);
            }
        });
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Three();
    }
}
