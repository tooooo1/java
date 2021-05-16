package six;

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


public class Three {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        System.out.println(p.toString());

        MovablePoint m = new MovablePoint(3,4,3,4);
        System.out.println(m.toString());
    }
}
