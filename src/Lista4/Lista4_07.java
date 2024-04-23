package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista4_07 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] x = new int[10];
        int[] y = new int[10];

        System.out.println("Digite alguns numeros inteiros: ");

        for (int i=0; i< x.length; i++){
        x[i]= ler.nextInt();

        if (x[i]%2==0){ y[i]=x[i]*2;}
        else {y[i]=x[i]*3;}
    }
        System.out.println("\n"+ Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}