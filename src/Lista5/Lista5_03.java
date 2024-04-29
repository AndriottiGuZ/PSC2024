package Lista5;

import java.util.Random;

public class Lista5_03 {
    public static void main(String[] args) {
        int[] C = new int[5];
        int[][] M = new int[2][5];
        Random random = new Random();

        for (int i = 0; i<2; i++){
            for (int j = 0; j<5; j++){
                M[i][j]=random.nextInt(20);
            }
        }

        for (int i = 0; i<1; i++) {
            for (int j = 0; j < 5; j++) {
                C[j] = M[i][j] + M[i + 1][j];
            }
        }

        for (int i = 0; i<5; i++){
            System.out.printf("soma coluna %d [%d + %d = %d]\n",i,M[0][i],M[1][i],C[i]);
        }
    }
}
