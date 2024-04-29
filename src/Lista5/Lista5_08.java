package Lista5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Lista5_08 {
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        float soma=0;
        Random random = new Random();
        DecimalFormat decimal = new DecimalFormat("#0.00");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) { soma += M[i][j];
                };
            }
            System.out.println(Arrays.toString(M[i]));
        }
        float mediaDiagonal = soma / 10;
        System.out.print("\na soma diagonal eh: ");
        System.out.print(soma);
        System.out.print("\na media das diagonais eh: ");
        System.out.print(decimal.format(mediaDiagonal));


    }
}
