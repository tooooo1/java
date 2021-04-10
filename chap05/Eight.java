package chap05;


public class Eight {
    public static void main(String[] args) {
        Program(5,10,0.3);
        Program_Neighbor(5,10,0.3);


    }



    public static void Program(int m, int n, double p) {
        String[][] b= new String[m][n];

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
        int count = 0;

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
                if(b[i][j].equals("-")) {
                    if ((i>0 && j >0) || ((i<m)&&(j<n)) ) {
                        for(int x=-1;x<2;x++) {
                            for(int y=-2;y<2;y++) {
                                if(b[i + x][j + y].equals("*")) {
                                    count++;
                                }
                            }
                        }
                        b[i][j] = String.valueOf(count);
                        count =0;

                    }



                }
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
}