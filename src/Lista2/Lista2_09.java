package Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2_09 {
    public static void main(String[] args) {

        //9. (ExeSelecao9.java) Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se
        //forem compradas menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.

        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.00");

        Double nl,pd = 0.25,pu = 0.30;

        System.out.print("quantas laranjas serão compradas: ");
        nl = ler.nextDouble();

        if (nl < 12){
            System.out.println("\nO valor total da compra eh de: R$ " + decimal.format(nl*pu));
        }else{
            System.out.println("\nO valor total da compra eh de: R$ " + decimal.format(nl*pd));
        }
        System.out.printf("\n%s\n%s\n%s\n",
                           "O valor das laranjas eh:",
                           "acima de 12 unidades R$ 0.25",
                           "abaixo de 12 unidades R$ 0.30");
    }
}
