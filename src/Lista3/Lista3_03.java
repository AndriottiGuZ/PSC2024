package Lista3;

import java.util.Scanner;

public class Lista3_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A,i=1, t=0;

        System.out.print("digite um numero inteiro:");
        A = ler.nextInt();

        System.out.println("");

        for (i = 1; i <= (A-1);i++) {
            if (A % i == 0) {
                System.out.printf("%d eh divisor do %d...\n",i,A); t+=i;
             }
        } System.out.printf("\na soma desses numero eh: %d\n",t);

        if (A==t){
            System.out.printf("\n%d eh um numero perfeito!!\n\n",A);}else{
            System.out.printf("\n%d eh um numero imperfeito!!\n\n",A);}
    }
}
