package Lista9.eletrodomesticos;

public class Tv extends Eletrodomestico{

    public int tamanho;

    public Tv(boolean ligada, int voltagem) {
        super(ligada, voltagem);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int canal = 7;
    public int volume = 16;

}
