package study;

// 3장 3번

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int input;
        int even =0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            input =in.nextInt();
            if (input % 2 == 0)
                even = even + input;
        }while(input>0);

        System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d",even);
    }
}
