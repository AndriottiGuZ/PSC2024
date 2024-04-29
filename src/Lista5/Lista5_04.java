package Lista5;

import java.util.Arrays;
import java.util.Random;

public class Lista5_04 {
    public static void main(String[] args) {

        int soma = 0, soma2 = 0;
        int[][] M = new int[2][10];
        Random random = new Random();

        for (int i = 0; i<2; i++){
            for (int j = 0; j<10; j++){
                M[i][j]=random.nextInt(50);
            }
        }

        for (int i = 0; i<10; i++) {
            if (i%2==0){
            soma += M[0][i];
            soma2 += M[1][i];}
        }

        System.out.println(Arrays.toString(M[0]));
        System.out.println(Arrays.toString(M[1]));
        System.out.println("soma dos dos pares da Matriz 0 eh: " + soma);
        System.out.println("soma dos dos pares da Matriz 0 eh: " + soma2);

    }
}
