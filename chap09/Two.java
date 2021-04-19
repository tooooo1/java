package chap09;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "학생[" + name + "]";
    }
}

public class Two {
    public static void main(String[] args) {
        System.out.println(new Student("김삿갓"));
        System.out.println(new Student("홍길동"));
    }
}
