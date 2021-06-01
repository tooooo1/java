package chap14;

import javax.swing.*;
import java.awt.*;

public class Six extends JFrame {
    Six() {
        JPanel panel = new JPanel();
        setTitle("애완 동물");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        JRadioButton dog = new JRadioButton("강아지");
        JRadioButton cat = new JRadioButton("고양이");
        JRadioButton goldfish = new JRadioButton("금붕어");
        dog.setSelected(true);

        ButtonGroup group = new ButtonGroup();

        group.add(dog);
        group.add(cat);
        group.add(goldfish);

        this.add(dog);
        this.add(cat);
        this.add(goldfish);
        setSize(250,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Six();
    }
}
