package chap02;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.print("대문자로 변환할 알파벳을 입력해주세요 : ");
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        int a = (int)'A'-(int)'a';
        char result = (char) ((int) c + a);

        System.out.print(result);
    }
}
