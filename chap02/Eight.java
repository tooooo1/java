package chap02;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        String input = in.nextLine(); // String으로 문자를 입력받는다.
        int sum=0;

        //for문을 자릿수 숫자만큼 돌리고 각 자릿수의 값을 sum에 더한다.
        for (int i = 0; i<input.length();i++) {
            sum += Integer.parseInt(input.substring(i,i+1));
        }

        //값을 출력한다.
        System.out.print("각 자리 수의 합 = " + sum);


    }
}
