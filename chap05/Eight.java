package chap05;


public class Eight {
    public static void main(String[] args) {
        Program(5,10,0.3);
        Program_Neighbor(5,10,0.3);


    }



    public static void Program(int m, int n, double p) {
        String[][] b= new String[m][n];
        int c[][] = new int[m][n];

        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if(p>Math.random()) {
                    b[i][j] = "*";
                }
                else {
                    b[i][j] = "-";
                }
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
    public static void Program_Neighbor(int m, int n, double p) {
        String[][] b= new String[m][n];
        int c[][] = new int[m][n];

        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if(p>Math.random()) {
                    b[i][j] = "*";
                }
                else {
                    b[i][j] = "-";
                }
            }
        }

        for(int i =0; i<m;i++) {
            for (int j=0; j<n;j++) {
                if ((i>=1 && j >=1) || ((i<=m-1)&&(j<=n-1)) ) {
                    if(b[i][j].equals("-")) {
                        for(int x=-1;x<2;x++) {
                            for(int y=-1;y<2;y++) {
                                if(b[i + x][j + y].equals("*")) {
                                    c[i][j]++;
                                }
                            }
                        }
                        System.out.println(c[i][j]);

                    }



                }
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
}