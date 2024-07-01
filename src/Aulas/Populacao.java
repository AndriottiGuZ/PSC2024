package Aulas;

public class Populacao {
    public static void main(String[] args) {

        int a = 90000000, b = 200000000, ano = 0;
        while (b > a) {
            ano++;
            a = (int) (a * 1.03 + a);
            b = (int) (b * 1.015 + b);
        }
        System.out.println("são neceçarios " +ano+ " anos para Pais A alcanças o pais B");
        System.out.println(b +" "+ b);
    }
}

