package CdPlayer;

import java.util.Scanner;

public class TestaCD {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        CDPlayer cdPlayer = new CDPlayer();
        int S;

        do {
            System.out.println("\nDigite o proximo comando:");
            System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n",
                    "1. play",
                    "2. pause",
                    "3. parar",
                    "4. proxima faixa",
                    "5. faixa anterior",
                    "0. Desligar");
            System.out.print("comando: ");
            S = ler.nextInt();

            switch (S) {

                case 1: {
                    cdPlayer.tocaCD();
                    cdPlayer.Status();
                    break;
                }
                case 2: {
                    cdPlayer.interrompeCD();
                    cdPlayer.Status();
                    break;
                }
                case 3: {
                    cdPlayer.paraCD();
                    cdPlayer.Status();
                    break;
                }
                case 4: {
                    cdPlayer.proximaFaixa();
                    cdPlayer.Status();
                    break;
                }
                case 5: {
                    cdPlayer.faixaAnterior();
                    cdPlayer.Status();
                    break;
                }
                case 0: {
                    System.out.println("Desligando....");
                    break;
                }
                default: {
                    System.out.println("Este comando não existe, tente novamente!!!");}
            }
        } while (S != 0);

    }
}