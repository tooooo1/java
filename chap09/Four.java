package chap09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Four {
    public static void main(String[] args) {
        System.out.print("입력 : ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); //입력받기

        StringTokenizer st = new StringTokenizer(input);

        int count = st.countTokens();
        System.out.println("단어 개수 : " + count); //단어 개수 세기

        String[] st_arrays = new String[count]; //정렬하기 위해 배열 생성
        for(int i =0; i< count;i++) { //배열에 넣기
                st_arrays[i]=st.nextToken();
            }

        Arrays.sort(st_arrays); //정렬

        for (int i=0; i<count;i++) { //출력
            System.out.print(st_arrays[i] + ", ");
        }
    }
}
