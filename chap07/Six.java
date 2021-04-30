package chap07;

interface Printable {
}

class A4 implements Printable {
    public void a() {
        System.out.println("A4");
    }
}

class B4 implements Printable {
    public void b() {
        System.out.println("B4");
    }
}

class Call {
    void invoke(Printable p) {
        if (p instanceof A4==true) {
            A4 p1 = (A4)p;
            p1.a();
        } else {
            B4 p1 = (B4)p;
            p1.b();
        }
    }
}

public class Six {
    public static void main(String[] args) {
        Printable p = new B4();
        Call c = new Call();
        c.invoke(p);
    }
}
