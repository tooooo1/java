package chap05;

import java.util.Scanner;

public class One {
    static int count =0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0);

        System.out.println(countChar(s,c));
    }

    //countChar 메서드
    static int countChar (String s,char c) {
        for(int i=0; i < s.length(); i++) {
            if (s.charAt(i)==c)
                count++;
        }
        return count;
    }
}
