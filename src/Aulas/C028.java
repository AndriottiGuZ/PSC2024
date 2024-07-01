package Aulas;

import java.util.Scanner;

public class C028 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();


        if(idade>10 & idade<66){
            if(idade>10 & idade<30){
                System.out.println("\nO valor do seu plano é: R$60");
            }
            if(idade>29 & idade<46){
                System.out.println("\nO valor do seu plano é: R$120");
            }
            if(idade>45 & idade<60){
                System.out.println("\nO valor do seu plano é: R$150");
            }
            if(idade>59 & idade<66){
                System.out.println("\nO valor do seu plano é: R$250");}
        }
        else{ System.out.println("\nO valor do seu plano é: R$400");
        }
    }
}

