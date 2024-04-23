package Lista2;

import java.nio.channels.UnsupportedAddressTypeException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2_07 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.0");

        Double x,y,z,a,b,NV;

        System.out.print("digite o número de eleitores: ");
        x = ler.nextDouble();
        System.out.print("digite o número de votos em branco: ");
        y = ler.nextDouble();
        System.out.print("digite o número de votos nulos: ");
        z = ler.nextDouble();
        System.out.print("digite o número de votos validos: ");
        a = ler.nextDouble();

        b = 100 / x;
        NV = x - (y + z + a);

        System.out.println();

        if(x >= (y + z + a)){
        System.out.println("a porcentagem de votos validos eh: " + decimal.format(a * b) + "%");
        System.out.println("a porcentagem de votos em branco eh: " + decimal.format(y * b) + "%");
        System.out.println("a porcentagem de votos nulos eh: " + decimal.format(z * b) + "%");
        System.out.println("a porcentagem de invalidos: " + decimal.format(NV * b) + "%");}
        else {
            System.out.println("dados informados não correspondem!");
        }
    }
}
