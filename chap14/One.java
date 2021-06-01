package chap14;

import javax.swing.*;

public class One extends JFrame {
    public static void main(String[] args) {
        String resultStr1 = null;
        String resultStr2 = null;
        JOptionPane input = new JOptionPane();
        resultStr1 = JOptionPane.showInputDialog(null,"첫 번째 숫자는?","입력",JOptionPane.QUESTION_MESSAGE);
        resultStr2 = JOptionPane.showInputDialog(null,"두 번째 숫자는?","입력",JOptionPane.QUESTION_MESSAGE);
        int result= Integer.parseInt(resultStr1) + Integer.parseInt(resultStr2);
        JOptionPane.showMessageDialog(null,"합 = "+result, "메시지",JOptionPane.INFORMATION_MESSAGE);
    }
}
