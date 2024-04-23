package Lista2;

import java.util.Scanner;

public class Lista2_03 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite dois números inteiro: ");
        num1 = ler.nextInt();
        num2 = ler.nextInt();

        if (num1 < num2){ System.out.println("Esse número eh maior: " + num2);}
        else { System.out.println("Esse número eh maior: " + num1);
        }
    }
}
