package Lista5;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class Lista5_1 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][];
        matriz[0] = new int[7];
        matriz[1] = new int[9];
        int numeroAleatorio = 0, somaMatriz0=0, somaMatriz1=0;;

        for (int i = 0; i<2;i++) {
            for (int j = 0; j < matriz[i].length; j++){numeroAleatorio++;
                matriz[i][j] = numeroAleatorio;

                if (i == 1)
                    somaMatriz1 += matriz[i][j];
                else {
                    somaMatriz0 += matriz[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        System.out.println("soma da matriz[0] é: " + somaMatriz0);
        System.out.println("soma da matriz[1] é: " + somaMatriz1);
    }
}