package Lista5;

import java.util.Arrays;
import java.util.Random;

public class Lista5_05 {
    public static void main(String[] args) {
        int soma = 0;
        int[][] MA = new int[2][5];
        int[][] MB = new int[2][5];
        int[][] MS = new int[2][5];
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                MA[i][j] = random.nextInt(50);
                MB[i][j] = random.nextInt(50);

                MS[i][j] = MA[i][j] + MB[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("A%d/%d [%d] + B%d/%d [%d] = S%d/%d [%d]\n",
                                   i,j,MA[i][j], i,j,MB[i][j], i,j,MS[i][j]);
            }
        }
        System.out.println("");
        System.out.println(Arrays.toString(MA[0]));
        System.out.println(Arrays.toString(MA[1]));
        System.out.println(Arrays.toString(MB[0]));
        System.out.println(Arrays.toString(MB[1]));
    }
}
