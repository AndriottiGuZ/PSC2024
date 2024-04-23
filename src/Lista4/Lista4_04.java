package Lista4;

import java.util.Scanner;

public class Lista4_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = {1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,19,20};
        int a=0, imp=0, par=0;
        for (int i=0; i < vetorA.length; i++){


            if (vetorA[i]%2==0){
                System.out.println(vetorA[i] + " eh par...");par++;}else{
                System.out.println(vetorA[i] + " eh impar...");}
            }
        System.out.println("\nforam contados " + par + " números pares!!");
    }
}
