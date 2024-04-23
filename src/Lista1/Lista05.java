package Lista1;

import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //(PI . (r . r)). obs - PI = 3,141592

        float  P, r, a;

        System.out.print("Digite o Raio de um circulo em metros: ");
        r = ler.nextFloat();

        P = 3.141592F;

        a = (float) (P * (r * r));

        System.out.printf("A aréa deste ciculo é de: %.1f metros", a);
    }
}
