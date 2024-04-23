package Lista3;

import com.sun.source.tree.WhileLoopTree;

import javax.sound.midi.Soundbank;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Lista3_04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int A, B, r = 1;

        while (r == 1) {
            System.out.println("\ndigite dois numeros inteiros: ");
            A = ler.nextInt();
            B = ler.nextInt();

            if (A != B) {
                if (A < B) {
                    System.out.println("os números foram escritos em ordem crescente!!");
                } else {
                    System.out.println("os números foram escritos em ordem decrescente!!");
                }
            } else {
                System.out.println("programa finalizado!");
                break;
            }
        }
    }
}
