package chap04;

class Triangle {
    private double side;
    private double height;
    public Triangle (double height, double side) {
        this.height = height;
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public double getHeight() {
        return height;
    }
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
