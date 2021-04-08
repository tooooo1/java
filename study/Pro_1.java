package study;

import java.util.Scanner;

class Solution {
    private String phone_number;
    public String solution(String phone_number) {
        String answer = "";
        char[] change = phone_number.toCharArray();
        for(int i =0 ; phone_number.length()-4>i;i++)
            change[i]='*';
        answer = String.valueOf(change);
        return answer;
    }
}

public class Pro_1 {
    public static void main(String[] args) {
        String phone_number;
        Scanner in = new Scanner(System.in);
        phone_number = in.nextLine();
        Solution test = new Solution();
        if ((phone_number.length()>=4) && (phone_number.length()<=20))
            System.out.println(test.solution(phone_number));
        else
            System.out.println("길이가 4 미만이거나 20을 초과하였습니다.");
    }



}
