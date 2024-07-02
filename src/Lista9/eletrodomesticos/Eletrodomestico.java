package Lista9.eletrodomesticos;

public class Eletrodomestico {
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    private boolean ligada;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    private int voltagem;

    public Eletrodomestico(boolean ligada, int voltagem){
        this.ligada = ligada;
        this.voltagem = voltagem;
    }
}
