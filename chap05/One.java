package chap05;

import java.util.Scanner;

public class One {
    static int num =0;
    static int countChar (String s,char c) {
        for(int i=0; i < s.length(); i++) {
            if (s.charAt(i)==c)
                num++;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("문자열과 문자를 입력하시오.");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0);

        System.out.println(s + " 에는 " + c + "가(이)" + countChar(s,c) + " 개가 있습니다.");
    }


}
