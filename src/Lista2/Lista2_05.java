package Lista2;

import java.util.Scanner;

public class Lista2_05 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1;

        System.out.print("Digite um número inteiro: ");
        num1 = ler.nextInt();

        if ((num1 >= 100) & (num1 <= 200)){
            System.out.println("Esse número está no intervalo de (100-200)");}
        else { System.out.println("Esse número não está no intervalo de (100-200)");
        }
    }
}
