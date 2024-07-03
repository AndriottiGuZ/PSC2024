package MeusTestes.AppDeComandas;

import java.text.DecimalFormat;

public class Bebida extends Item {

    public Bebida(String nomeDoitem, int codigoDeCompra, double valor, int mls) {
        this.nomeDoitem = nomeDoitem;
        this.codigoDeCompra = codigoDeCompra;
        this.valor = valor;
        this.Mls = mls;
    }

    public int getMls() {
        return Mls;
    }

    public void setMls(int mls) {
        Mls = mls;
    }

    public int Mls;

    @Override
    public String toString() {
        DecimalFormat real= new DecimalFormat("#0.00");
        return "Código " + getCodigoDeCompra() +". "+ nomeDoitem + " " + getMls() + "ml" + " valor: R$" + real.format(valor) ;}
}
