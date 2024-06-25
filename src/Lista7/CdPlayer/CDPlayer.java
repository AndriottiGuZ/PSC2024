package Lista7.CdPlayer;

public class CDPlayer extends Musica {

    int faixaAtual = 1;
    String estado;
    CD cd = new CD();

    public int getFaixaAtual() {
        return faixaAtual;
    }

    public void setFaixaAtual(int faixaAtual) {
        this.faixaAtual = faixaAtual;
    }

    public String getEstado() {
        return estado;
    }

    public String setEstado(String estado) {
        this.estado = estado;
        return estado;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public void tocaCD() { setEstado("tocando");

    }

    public void interrompeCD() { setEstado("pausado");

    }

    public void paraCD() { setEstado("parado");

    }

    public void proximaFaixa() {
        if (faixaAtual < numeroDeMusicas) {faixaAtual++;
            System.out.println("\npassando para proxima faixa, faixa de numero " + faixaAtual);
        } else { faixaAtual = 1;
            System.out.println("\npassando para proxima faixa, faixa de numero " + faixaAtual);
        }
        }

        public void faixaAnterior () {
            {
                if (faixaAtual > 1) {faixaAtual--;
                    System.out.println("\nvoltando para faixa anterior, faixa de numero " + faixaAtual);
                } else {faixaAtual = 20;
                    System.out.println("\npassando para proxima faixa, faixa de numero " + faixaAtual);
                }

            }
        }

            public void Status () {
                System.out.println("\nstaus: " + getEstado());
                System.out.println("faixa atual: " + getFaixaAtual());
                System.out.println("numero de faixas : " + getNumeroDeMusicas());

            }
}
