package chap02;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = in.nextInt();
        in.close();
        System.out.printf("%d의 제곱은 %d",input,input*input);
    }
}
