package chap06;

class Parent {
    String name = "영조";
    void print() {
        System.out.println("나는 영조이다.");
    }
}

class Child extends Parent {
    String name = "사도세자";

    void print() {
        System.out.println("나는 사도세자이다.");
    }
}

public class Four {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name);
        p.print();
    }
}
