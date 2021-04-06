package chap05;



public class Two {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        int arr[] = {2,3};
        System.out.println(sum(1,arr));
        System.out.println(sum(1,2,3,4,5));
    }

    private static int sum (int i, int ... j) {
        int sum2 = 0;
        for (int k : j) {
            sum2 += k;
        }
        return sum2;
    }

}

