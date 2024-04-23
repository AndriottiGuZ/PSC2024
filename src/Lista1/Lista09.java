package Lista1;

import java.util.Scanner;

public class Lista09 {
    public static void main(String[] args){

        // Homens = 650gr;
        // Mulheres = 420gr;
        // Crianças = 290gr;

        int homens, mulheres, criancas, montantePessoas;
        double montante = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("--- LISTA CHURRASCO ---");
        System.out.print("Quantidade de homens: ");
        homens = ler.nextInt();
        montante += homens * 0.650;
        System.out.print("Quantidade de mulheres: ");
        mulheres = ler.nextInt();
        montante += mulheres *0.420;
        System.out.print("Quantidade de crianças: ");
        criancas = ler.nextInt();
        montante += criancas * 0.290;
        montantePessoas = homens + mulheres + criancas;
        System.out.println("Quantidade total de pessoas: " + montantePessoas);

        System.out.print("Quantidade total de carne em Kg: " + montante + " kg");

    }

}
