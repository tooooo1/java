package chap05;

public class Three {
    public static void main(String[] args) {
        double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
        double[] sum1 =  { 0.0, 0.0, 0.0 };
        double sum2 = 0.0;

        int k = 0;
        int f = 0;
        for (double i[] : interests) {
            for (double j : i) {
                sum1[k] += j;
            }
            System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", f + 1, sum1[k] / 4);
            sum2 += sum1[k];
            k++;
            f++;
        }
        System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2 / 3);
    }

    }
