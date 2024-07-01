package Aulas;

import java.util.Scanner;

public class C005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite dois numeros inteiros: ");
        num1 = ler.nextInt();
        num2 = ler.nextInt();

        if (num1%num2==0){
            System.out.printf("%d é divisivel por %d", num1, num2);
        }
        if (num2%num1==0) {
            System.out.printf("\n%d é divisivel por %d", num2, num1);
        }else
            System.out.printf("os numeros não são divisiveis", num1, num2);
    }
}

