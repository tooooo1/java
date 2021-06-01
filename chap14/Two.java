package chap14;

import javax.swing.*;

public class Two extends JFrame {
    public Two() {
        setTitle("이미지를 포함한 레이블");

        ImageIcon icon = new ImageIcon(getClass().getResource("bear.png"));
        JLabel label = new JLabel("곰인형",icon,JLabel.CENTER);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Two();
    }
}
