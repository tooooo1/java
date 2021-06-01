package chap14;

import javax.swing.*;
import java.awt.*;

public class Seven extends JFrame {
    Seven() {
        setTitle("박스 레이아웃");
        Container con = getContentPane();
        con.setLayout(new BoxLayout(con,BoxLayout.X_AXIS));

        for(int i=1;i<=5;i++) {
            con.add(new JButton("버튼 "+i));
        }

        setSize(360,60);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Seven();
    }
}
