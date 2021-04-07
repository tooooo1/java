package study;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.printf("정수를 입력하세요 : ");
        input = in.nextInt();

        System.out.printf("%d의 제곱은 %d",input,input*input);
    }
}
