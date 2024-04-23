package Lista3;

import java.util.Scanner;

public class Lista3_01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i =0, num, tp=0, ti=0, ttp=0, tti=0;

        System.out.print("Digite um numero inteiro: ");
        num = ler.nextInt();

        System.out.print("\nos numeros pares são:\n");

        for (i =1; i <= num; i++){ if (i%2>=1){
            System.out.printf("%d eh impar...\n",i); ti++; tti+=i;}else{
            System.out.printf("%d eh par...\n",i); tp++; ttp+=i;}
        }

        System.out.printf("\n\no total de numeros pares eh: %d\n",tp);
        System.out.printf("o total de numeros impares eh: %d\n",ti);

        System.out.printf("\no total da soma dos numeros pares eh: %d\n",ttp);
        System.out.printf("o total da soma dos numeros impares eh: %d\n\n",tti);

    }
}
