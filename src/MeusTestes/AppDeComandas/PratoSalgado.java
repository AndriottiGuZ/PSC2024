package MeusTestes.AppDeComandas;

import java.text.DecimalFormat;

public class PratoSalgado extends Item {

    public PratoSalgado(String nomeDoitem, int codigoDeCompra, double valor, int porção) {
        this.nomeDoitem = nomeDoitem;
        this.codigoDeCompra = codigoDeCompra;
        this.valor = valor;
        this.porção = porção;
    }

    public int getCalorias() {
        return porção;
    }

    public void setCalorias(int porção) {
        this.porção = porção;
    }

    int porção;

    @Override
    public String toString() {
        DecimalFormat real= new DecimalFormat("#0.00");
        return "Código " + getCodigoDeCompra()+". " + nomeDoitem + " " + porção +"g"+ " valor: R$" + real.format(valor) ;}
}
