package chap09;

public class Six {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
    }

    public static void show(Object out) {
        System.out.println(out);
    }
}
