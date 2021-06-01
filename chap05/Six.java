package chap05;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int num[] = new int[5];

        Scanner in = new Scanner(System.in);
        System.out.print("역순으로 변환할 배열(5개) : ");
        for (int i = 0; num.length > i; i++) {
            num[i] = in.nextInt();
        }
        reverse(num);
    }
        public static int[] reverse(int[] org) {
            System.out.print("역순으로 변환한 배열(5개) : ");
            for(int j=5;j>0;j--) {
                System.out.print(org[j-1] + " ");
            }
            return org;
        }


}
