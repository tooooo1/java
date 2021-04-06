package chap04;

class Line {
    private int line;

    public Line (int line) {
        this.line = line;
    }

    public boolean isSameLine(Line l) {
        if (line ==l.line)
            return true;
        else
            return false;
    }
}

public class Five {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
