package chap07;

interface Edible {
    void eat();
}

interface Sweetable {
    void sweet();
}

interface Delicious extends Edible,Sweetable {
}

public class Two {
    public static void main(String[] args) {
    }
}
