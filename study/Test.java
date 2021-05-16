package study;

import java.util.Scanner;

//4장 1번 클래스
class Triangle {
    private double side; //밑변
    private double height; //높이
    //생성자
    public Triangle (double height, double side) {
        this.height = height;
        this.side = side;
    }
    //접근자
    public double getSide() {
        return side;
    }
    //접근자
    public double getHeight() {
        return height;
    }
    //문제에서 주어진 함수(findArea())
    public double findArea() {
        return side * height * 0.5;
    }
    public boolean isSameArea(Triangle k) {
        if(k.findArea()==findArea())
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return "Triangle [side=" + side + ", height=" + height + "]";
    }
}

//4장 3번 클래스
class Member {
    //회원정보
    private String name;
    private String id;
    private String password;
    private int age;
    //생성자
    public Member(String name,String id,String password,int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
    //get = 접근자, set = 설정자
    public String getId() {
        return id;
    }
    public void setId() {
        this.id =id;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getPasswd() {
        return password;
    }
    public void setPasswd() {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
    }
}

//4장 4번 클래스
class Car {
    private String color;
    static int numOfCar = 0;
    static int numOfRedCar = 0;
    public Car(String color) {
        this.color = color;
        numOfCar++;
        if (color.equalsIgnoreCase("red"))
            numOfRedCar++;
    }
    static public int getNumOfCar() {
        return numOfCar;
    }
    static public int getNumOfRedCar() {
        return numOfRedCar;
    }
    @Override
    public String toString() {
        return "Car [color=" + color + "]";
    }
}

//4장 6번 클래스
class Complex {
    private double num1;
    private double num2;
    public Complex(double num1) {
        this.num1 = num1;
    }
    public Complex(double num1,double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void print() {
        System.out.println(num1 +"+"+ num2+"i");
    }
    @Override
    public String toString() {
        return "Complex [num1=" + num1 + ", num2=" + num2 + "]";
    }
}

//4장 7번 클래스
class GolfClub {
    private int num;
    private String name;
    public GolfClub() {
        this.num = 7;
        this.name = "아이언";
    }
    public GolfClub(int num) {
        this.num = num;
        this.name = "아이언";
    }
    public GolfClub(String name) {
        this.name = name;
        this.num = -1;
    }
    public void print() {
        if (num < 0)
            System.out.println(name + "입니다.");
        else
            System.out.println(num + "번 " + name + "입니다.");
    }
    @Override
    public String toString() {
        return "GolfClub [num=" + num + ", name=" + name + "]";
    }
}

//4장 8번 클래스
class Dice {
    private double face;
    public Dice() {
        this.face=face;
    }
    public int roll() {
        this.face = ((Math.random() * 10 % 6) +1);
        return (int)face;
    }
    @Override
    public String toString() {
        return "Dice [face=" + face + "]";
    }
}

//6장 1번 클래스(2개)
class Circle {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
//2
class ColoredCircle extends Circle {
    String color;

    ColoredCircle(int radius, String color) {
        super(radius);
        this.color=color;
    }
    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
    }
    @Override
    public String toString() {
        return "ColoredCircle [color=" + color + "]";
    }
}

//6장 2번 클래스(3개)
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //접근자
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    //설정자
    void setName(String name) {
        this.name=name;
    }
    void setAge(int age) {
        this.age=age;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
//2
class Student extends Person {
    int class_num;

    Student(String name, int age, int class_num) {
        super(name, age);
        this.class_num = class_num;
    }
    //접근자
    int getClass_num() {
        return class_num;
    }
    //설정자
    void setClass_num(int class_num) {
        this.class_num=class_num;
    }
    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + "]");
    }
    @Override
    public String toString() {
        return "Student [class_num=" + class_num + "]";
    }
}
//3
class ForeignStudent extends Student {
    String country;
    ForeignStudent(String name, int age, int class_num, String country) {
        super(name, age, class_num);
        this.country=country;
    }
    //접근자
    String getCountry() {
        return country;
    }
    //설정자
    void setCountry(String country) {
        this.country = country;
    }
    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num +", 국적 : " + country + "]");
    }
    @Override
    public String toString() {
        return "ForeignStudent [country=" + country + "]";
    }
}

//6장 3번 클래스(2개)
class Point {
    private int x,y;
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    int getX() { //접근자
        return x;
    }
    int getY() {
        return x;
    }
    void setX(int x) { //생성자
        this.x = x;
    }
    void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
//2
class MovablePoint extends Point {
    private int xSpeed, ySpeed;
    MovablePoint(int x, int y,int xSpeed, int ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    int getxSpeed() { //접근자
        return xSpeed;
    }
    int getySpeed() {
        return ySpeed;
    }
    void setxSpeed(int xSpeed) { //생성자
        this.xSpeed = xSpeed;
    }
    void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint [x=" + getX() + ", y =" +getY() + " xSpeed=" + xSpeed + ", ySpeed =" + ySpeed + "]";
    }
}

//6장 5번 클래스(3개)
class Phone {
    protected String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void talk() {
        System.out.println(owner + "가 통화 중이다.");
    }
    @Override
    public String toString() {
        return "Phone [owner=" + owner + "]";
    }
}
//2
class Telephone extends Phone {
    private String when;
    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
    void autoAnswering() {
        System.out.println(owner + "가 없다. " + when + "전화 줄래.");
    }
    @Override
    public String toString() {
        return "Telephone [when=" + when + "]";
    }
}
//3
class Smartphone extends Telephone {
    private String game;
    Smartphone(String owner, String game) {
        super(owner,"when");
        this.game = game;
    }
    void playGame() {
        System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
    }
    @Override
    public String toString() {
        return "Smartphone [game=" + game + "]";
    }
}




//1번 최종조건
public class Test {
    public static void main(String[] args) {
        //4장-> toString으로 정상적으로 생성되었음을 표현
        System.out.println(Triangle.class.toString()); //1번
        System.out.println(Member.class.toString()); //3번
        System.out.println(Car.class.toString()); //4번
        System.out.println(Complex.class.toString()); //6번
        System.out.println(GolfClub.class.toString()); //7번
        System.out.println(Dice.class.toString()); //8번

        //6장-> toString으로 정상적으로 생성되었음을 표현
        System.out.println(Circle.class.toString()); //1번-1
        System.out.println(ColoredCircle.class.toString()); //1번-2
        System.out.println(Person.class.toString()); //2번-1
        System.out.println(Student.class.toString()); //2번-2
        System.out.println(ForeignStudent.class.toString()); //2번-3
        System.out.println(MovablePoint.class.toString()); //3번-1
        System.out.println(Point.class.toString()); //3번-2
        System.out.println(Phone.class.toString()); //5번-1
        System.out.println(Telephone.class.toString()); //5번-2
        System.out.println(Smartphone.class.toString()); //5번-3

        //추가조건
        int[] num = new int[10];
        int[] hist = {0,0,0,0,0,0,0,0,0,0};
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 10개 입력하세요.");
        for(int i=0; i< num.length; i++) {
            num[i] = in.nextInt();
            if(num[i]>=0 && num[i]<10) {
                hist[0] ++;
            }
            else if(num[i]>=10 && num[i]<20) {
                hist[1] ++;
            }
            else if(num[i]>=20 && num[i]<30) {
                hist[2] ++;
            }
            else if(num[i]>=30 && num[i]<40) {
                hist[3] ++;
            }
            else if(num[i]>=40 && num[i]<50) {
                hist[4] ++;
            }
            else if(num[i]>=50 && num[i]<60) {
                hist[5] ++;
            }
            else if(num[i]>=60 && num[i]<70) {
                hist[6] ++;
            }
            else if(num[i]>=70 && num[i]<80) {
                hist[7] ++;
            }
            else if(num[i]>=80 && num[i]<90) {
                hist[8] ++;
            }
            else if(num[i]>=90 && num[i]<100) {
                hist[9] ++;
            }
        }
        for(int i=0; i< hist.length; i++) {
            System.out.print((i*10)+"~"+(i*10+9)+":");
            for(int j=0; j<hist[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
