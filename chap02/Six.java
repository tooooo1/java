package chap02;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("화씨온도(F)를 입력하세요 : ");
        double F = in.nextDouble();
        double C = (5*(F-32))/9;

        System.out.printf("환산한 섭씨온도(C)는 %.1f입니다.",C);
    }
}
