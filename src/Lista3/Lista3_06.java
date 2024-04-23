package Lista3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lista3_06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, i, r=0, mult;

        while (r==0) {
            System.out.print("\nDigite um numeiro interiro: ");
            num = ler.nextInt();
            System.out.println("");
            i = 1;
            if (num >= 0) {
                for (i = 1; i <= 10; i++) {
                    mult = num * i;
                    System.out.printf("%d x %d = %d\n", num, i, mult);
                }
            } else {
                System.out.print("program finalizado!!");
                break;
            }
        }
    }
}
