package Lista6;

import java.util.Scanner;

public class Lista6_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] valores = new int[4];
        int media;
        do {
        for (int i=0; i<valores.length;i++){
            System.out.print("digite um numero interio: ");
            valores[i] = ler.nextInt();
            if (valores[i]<0)break;
        }
        media = getMedia(valores);
        System.out.println("A media desses numeros eh: " + media);
            System.out.println("");}while (media>0);

    }
    private static int getMedia(int[] valores) {
        int media=0;
        for (int i=0; i<valores.length; i++  ){
            media += valores[i];
        }
        return media/valores.length;
    }
}
