package Lista3;

import java.util.Scanner;

public class Lista3_08 {
    public static void main(String[] args) {
    int num=100,i=0,contador=0;

        System.out.println("os 50 numeros primos depois de 100 são:\n");

    while (contador<=50){num++;int c=0;
        for(int m=1;m<num;m++) {
            int result = num % m;
            if (result == 0) {
                c++;
            }
        } if (c==1){
            System.out.println(+num);contador++;}
        }
    }
}
