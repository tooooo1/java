package chap15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Two extends JFrame implements ActionListener{

    JPanel panel;
    Cards cards;

    public Two(){
        setTitle("카드 레이아웃");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        bt.addActionListener((ActionListener) this);
        target.add(bt);
    }

    class Cards extends JPanel{
        CardLayout layout;

        public Cards(){
            layout = new CardLayout();
            setLayout(layout);
            for(int i=0 ; i<=3 ; i++){
                JButton bt = new JButton();
                bt.setText("카드 번호" + (i+1) + "!");
                Color[] color = {Color.YELLOW, Color.BLUE, Color.PINK, Color.RED};
                bt.setBackground(color[i]);
                add(bt, BorderLayout.CENTER);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("<<")){
            cards.layout.first(cards);
        }
        if(e.getActionCommand().equals("<")){
            cards.layout.previous(cards);
        }
        if(e.getActionCommand().equals(">")){
            cards.layout.next(cards);
        }
        if(e.getActionCommand().equals(">>")){
            cards.layout.last(cards);
        }
    }
    public static void main(String[] args){
        new Two();
    }
}