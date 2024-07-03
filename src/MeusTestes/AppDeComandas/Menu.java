package MeusTestes.AppDeComandas;

import java.util.ArrayList;

public class Menu extends Comanda {
    public void menu(int pedido) {

        ArrayList<Object> itens = new ArrayList<>();

        itens.add(new PratoSalgado("Peixe", 1, 72.50, 120));
        itens.add(new PratoSalgado("Carne", 2, 53.50, 180));
        itens.add(new PratoSalgado("Frango", 3, 20, 130));
        itens.add(new PratoSalgado("Batata Frita", 4, 15, 300));
        itens.add(new PratoSalgado("Feijoada", 5, 25.50, 100));
        itens.add(new Sobremesa("Bolo", 7, 22, 200));
        itens.add(new Sobremesa("Mousse de Chocolate", 8, 16.90, 250));
        itens.add(new Sobremesa("Mousse de Maracuja", 9, 15, 210));
        itens.add(new Sobremesa("Arroz Doce", 10, 12.50, 209));
        itens.add(new Bebida("Coca-Cola", 11, 6.50, 350));
        itens.add(new Bebida("Cerveja", 12, 12, 450));
        itens.add(new Bebida("Suco de Laranja", 13, 8.50, 500));
        itens.add(new Bebida("Guarána", 14, 5, 350));
        itens.add(new Bebida("Suco de Uva", 15, 8, 500));

    }

    public static void exibirDetalhesItem(ArrayList<Object> itens, int id) {
        for (Object item : itens) {
            if (item instanceof PratoSalgado && ((PratoSalgado) item).codigoDeCompra == id) {
                System.out.println("Item encontrado: " + item.toString());
                return;
            } else if (item instanceof Sobremesa && ((Sobremesa) item).codigoDeCompra == id) {
                System.out.println("Item encontrado: " + item.toString());
                return;
            } else if (item instanceof Bebida && ((Bebida) item).codigoDeCompra == id) {
                System.out.println("Item encontrado: " + item.toString());
                return;
            }
        }
        System.out.println("Item com ID " + id + " não encontrado.");
    }
}
    }
}