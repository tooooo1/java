package chap05;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int num[] = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; num.length > i; i++) {
            num[i] = in.nextInt();
        }
        reverse(num);
    }
        public static int[] reverse(int[] org) {
            for(int j=5;j>0;j--) {
                System.out.println(org[j-1]);
            }
            return org;
        }


}
