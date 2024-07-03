package MeusTestes.AppDeComandas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Item item = new Item();
        Comanda comanda = new Comanda();
        Menu menu = new Menu();
        menu.menu();
    }
}