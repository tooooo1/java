package chap12;

public class Six {
    public static void main(String[] args) {
        String[] animals = {"ant", "bat", "cat", "dog"};

        for (String s : animals)
            System.out.println(s.charAt(0) + " : " + s);
    }
}
