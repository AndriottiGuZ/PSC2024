package MeusTestes.AppDeComandas;

import java.text.DecimalFormat;

public class Sobremesa extends Item{

    public Sobremesa(String nomeDoitem, int codigoDeCompra, double valor, int calorias) {
        this.nomeDoitem = nomeDoitem;
        this.codigoDeCompra = codigoDeCompra;
        this.valor = valor;
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    int calorias;
    @Override
    public String toString() {
        DecimalFormat real= new DecimalFormat("#0.00");
        return "Código " + getCodigoDeCompra() +". " + nomeDoitem + " " + calorias +"g" + " valor: R$" + real.format(valor) ;}
}
