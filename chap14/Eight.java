package chap14;

import javax.swing.*;
import java.awt.*;

public class Eight extends JFrame {

    JPanel panel;
    Cards cards;

    public Eight(){
        setTitle("카드 레이아웃");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(0, 4, 10, 0));

        addButton("<<", panel);
        addButton("<", panel);
        addButton(">", panel);
        addButton(">>", panel);
        add(panel, BorderLayout.NORTH);
        cards = new Cards();
        add(cards, BorderLayout.CENTER);
        setVisible(true);
    }

    public void addButton(String str, Container target){
        JButton bt = new JButton(str);
        target.add(bt);
    }
    class Cards extends JPanel{
        CardLayout layout;

        public Cards(){
            layout = new CardLayout();
            setLayout(layout);
            JButton bt = new JButton();
            bt.setText("카드 번호 1!");
            add(bt, BorderLayout.CENTER);
        }
    }

    public static void main(String[] args){
        new Eight();
    }

}