package chap03;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even =0;

        do {
            System.out.print("양의 정수를 입력하세요:");
            int number = in.nextInt();
            if (number % 2 == 0)
                even = even +number;
            else if (number <=0)
                break;
        }while (true);
        System.out.printf("입력한 양의 정수 중에서 짝수의 합은 " + even);
    }
}
