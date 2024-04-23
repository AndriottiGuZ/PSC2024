package Lista6;

import java.util.Scanner;

public class Lista6_01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1,num2,num3;
        do {
        System.out.println("Digite dois numeros inteiros: ");
        num2 = ler.nextInt();
        num1 = ler.nextInt();
        num3 = produto(num1,num2);
        System.out.println("o produto dos numeros eh: " + num3+ "\n\n");}
        while (num3>0);

    }

    private static int produto(int valor1, int valor2){
        return valor1 * valor2;


    }
}
