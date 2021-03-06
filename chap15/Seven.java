package chap15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

class RadioEvent extends JFrame{
    JRadioButton[] r=new JRadioButton[3];
    String[] names={"사과", "배", "체리"};
    ImageIcon[] i={
            new ImageIcon("cat.jpg"),
            new ImageIcon("dog.jpg"),
            new ImageIcon("goldfish.jpg")
    };
    JLabel la=new JLabel();
    RadioEvent(){
        this.setTitle("라디오버튼 이벤트처리");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonGroup bg=new ButtonGroup();

        this.setLayout(new BorderLayout());

        JPanel jp = new JPanel();
        jp.setBackground(Color.GRAY);

        for(int i=0; i<r.length; i++){
            r[i]=new JRadioButton(names[i]);
            bg.add(r[i]);
            r[i].addItemListener(new MyItemListener());
            jp.add(r[i]);
        }
        this.add(jp, BorderLayout.NORTH);
        this.add(la, BorderLayout.CENTER);
        la.setHorizontalAlignment(SwingConstants.CENTER);
        this.setSize(300,200);
        this.setVisible(true);
    }
    class MyItemListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.DESELECTED){
                return;
            }
            if(r[0].isSelected()){
                la.setIcon(i[0]);
            }
            else if(r[1].isSelected()){
                la.setIcon(i[1]);
            }
            else{
                la.setIcon(i[2]);
            }
        }

    }
}
public class Seven {

    public static void main(String[] args) {
        new RadioEvent();
    }

}