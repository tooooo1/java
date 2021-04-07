package chap05;

public class Seven {
    public static void main(String[] args) {
        int[] a = {3,2,4,1,5};
        int[] b = {3,2,4,1};
        int[] c = {3,2,4,1,5};
        int[] d = {2,7,1,8,2};

        if(equals(a,b)) {
            System.out.println("같다.");
        }
        if(equals(b,c)) {
            System.out.println("같다.");
        }
        if(equals(c,d)) {
            System.out.println("같다.");
        }
        if(equals(d,a)) {
            System.out.println("같다.");
        }
        if(equals(a,c)) {
            System.out.println("같다.");
        }
        if(equals(d,b)) {
            System.out.println("같다.");
        }
    }

    public static boolean equals (int[] input1, int[] input2) {
        if(input1.length != input2.length) {
            return false;
        }
        for(int i=0; i<(input1.length);i++) {
            if(input1[i] != input2[i]) {
                return false;
            }
        }
        return true;

    }


}
