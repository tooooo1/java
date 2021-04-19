package chap09;

class Dice {
    int roll() {
        return (int) (Math.random()*6+1);
    }
}

public class Five {
    public static void main(String[] args) {
        System.out.println(new Dice().roll());
    }
}
