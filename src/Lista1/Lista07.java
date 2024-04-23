package Lista1;

import java.util.Scanner;

public class Lista07 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float  polegadas;

        System.out.print("digite um tamanho em polegadas: ");
        polegadas = ler.nextFloat();

        float milimetros = (float) (polegadas * 25.4);

        System.out.println("A conversão em milímetros é: " + milimetros);
    }
}
