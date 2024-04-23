package Lista4;

import java.util.Scanner;

public class Lista4_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[6];
        int soma = 0, media, mult = 1, A, c = 0, Resp;

        System.out.println("Digite 6 numeros inteiros: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = ler.nextInt();
        }
        do {
            System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                    "---------------menu-------------",
                    "1. soma dos numeros",
                    "2. o produto dos numeros",
                    "3. Média dos numeros",
                    "4. mostrar um vetor expecifico",
                    "5. fechar",
                    "\nOPÇÃO: ");
            Resp = ler.nextInt();

            switch (Resp) {
                case 1:
                    for (int i = 0; i < num.length; i++) {
                        soma += num[i];
                    }
                    System.out.println("A soma dos valores eh: " + soma);break;

                case 2:
                    for (int i = 0; i < num.length; i++) {
                        A = mult * num[i];
                        mult = A;
                    }
                    System.out.println("o produto dos valores eh: " + mult);break;

                case 3:
                    for (int i = 0; i < num.length; i++) {
                        soma += num[i];
                    }
                    System.out.println("A media dos valores eh: " + soma / 6);break;

                case 4:
                    System.out.print("qual vetor você quer ver: ");
                    int n = ler.nextInt();

                    System.out.println("o numero eh: " + num[n]);break;


                case 5:
                    break;
            }


        } while (Resp<5);

    }
}