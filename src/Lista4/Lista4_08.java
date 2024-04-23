package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista4_08 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] n = new int[10];
        int[] n1 = new int[10];

        System.out.println("Digite os 10 vetores: ");

        for (int i=0; i < n.length; i++){

            n1[i] = ler.nextInt();

            if (i<5){ n[i+5]=n1[i];
            }else{ n[i-5]=n1[i];}
        }
        System.out.println(Arrays.toString(n));
    }
}
