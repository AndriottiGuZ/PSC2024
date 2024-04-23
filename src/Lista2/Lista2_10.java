package Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2_10 {
    public static void main(String[] args) {

       Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.0");

        int S;

        System.out.printf("\n\n%s\n%s\n%s\n%s\n%s\n",
                "--------------------------Frutas e seus valores------------------------",
                "1. Banana preço por unidade R$ 0,30 - preço por Duzia ou mais R$ 0,25",
                "2. Laranja preço por unidade R$ 0,40 - preço por Duzia ou mais R$ 0,35",
                "3. Maça preço por unidade R$ 0,50 - preço por Duzia ou mais R$ 0,45",
                "4. kiwi preço por unidade R$ 0,40 - preço por Duzia ou mais R$ 0,30",
                "-----------------------------------------------------------------------");

        System.out.print("\nEscolha a opção que seja comprar: ");
        S = ler.nextInt();

        switch (S){
            case 1:{
                double b,u = 0.30,d = 0.25;
                System.out.print("\nquantidade de bananas: ");
                b = ler.nextInt();

                if (b<12){
                    System.out.println("o total da compra eh: R$" + decimal.format(b * u)); break;}
                else{
                    System.out.println("o total da compra eh: R$" + decimal.format(b * d)); break;}}

            case 2:{
                double b,u = 0.40,d = 0.35;
                System.out.print("\nquantidade de Laranjas: ");
                b = ler.nextInt();

                if (b<12){
                    System.out.println("o total da compra eh: R$" + decimal.format(b * u)); break;}
                else{
                    System.out.println("o total da compra eh: R$" + decimal.format(b * d)); break;}}

            case 3:{
                double b,u = 0.50,d = 0.45;
                System.out.print("\nquantidade de maça: ");
                b = ler.nextInt();

                if (b<12){
                    System.out.println("o total da compra eh: R$" + decimal.format(b * u)); break;}
                else{
                    System.out.println("o total da compra eh: R$" + decimal.format(b * d)); break;}}

            case 4:{
                double b,u = 0.40,d = 0.30;
                System.out.print("\nquantidade de kiwi: ");
                b = ler.nextInt();

                if (b<12){
                    System.out.println("o total da compra eh: R$" + decimal.format(b * u)); break;}
                else{
                    System.out.println("o total da compra eh: R$" + decimal.format(b * d)); break;}}
        }
    }
}
