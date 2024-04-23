package Lista1;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Lista08 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int hora, minutos, segundos, tds;

        System.out.print("digite a hora: ");
        hora = ler.nextInt();
        System.out.print("digite os minutos: ");
        minutos = ler.nextInt();
        System.out.print("digite os segundos: ");
        segundos = ler.nextInt();

        tds = ((hora * 60) * 60) + (minutos * 60) + segundos;

        System.out.println("o total de segundos desse dia é de: " + tds + " segundos");
    }
}
