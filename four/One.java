package four;

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
}

public class One {
    public static void main(String[] args) {
        Triangle t = new Triangle (10.0, 5.0);
        System.out.println(t.findArea());

    }
}
