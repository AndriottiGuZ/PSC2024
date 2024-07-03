package MeusTestes.AppDeComandas;

public class Item {

    public String nomeDoitem;

    public String getNomeDoitem() {
        return nomeDoitem;
    }

    public void setNomeDoitem(String nomeDoitem) {
        this.nomeDoitem = nomeDoitem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigoDeCompra() {
        return codigoDeCompra;
    }

    public void setCodigoDeCompra(int codigoDeCompra) {
        this.codigoDeCompra = codigoDeCompra;
    }

    public double valor;
    public int codigoDeCompra;
}
