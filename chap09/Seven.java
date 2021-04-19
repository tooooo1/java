package chap09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Seven {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat format1, format2, format3;

        format1 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        format2 = new SimpleDateFormat("오늘은 M월의 d번째 날");
        format3 = new SimpleDateFormat("오늘은 y년의 D번째 날");

        System.out.println(format1.format(today));
        System.out.println(format2.format(today));
        System.out.println(format3.format(today));

    }
}