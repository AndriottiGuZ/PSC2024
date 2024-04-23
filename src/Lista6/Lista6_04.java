package Lista6;

import java.util.Scanner;

public class Lista6_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, num1;

        do {
            System.out.println("digite dois numeros inteiros: ");
            num = ler.nextInt();
            num1 = ler.nextInt();
            leitor(num,num1);
            System.out.println("");
        }while ((num1>0)||(num>0));
    }

    private static void leitor(int num, int num1) {
        if (num>num1){
            System.out.println(num + " eh maior que " + num1);}else
            System.out.println(num1 + " eh maior que " + num);
    }
}
