package chap09;

import java.text.MessageFormat;

public class Eight {
    public static void main(String[] args) {

        Object[][] data = {{"세종대왕", 1, "조선"},{"오바마", 2, "미국"}, {"징기스칸", 3, "몽고"}};
        String s = "이름 : {0}\t번호 : {1}\t국적 : {2}";
        for (Object[] k : data) {
            MessageFormat.format(s, k);
            System.out.println(MessageFormat.format(s, k));
        }
    }
}
