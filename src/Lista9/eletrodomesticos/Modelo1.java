package Lista9.eletrodomesticos;

public class Modelo1 extends Tv implements ControleRemoto{

    public Modelo1(boolean ligada, int voltagem, int tamanho) {
        super(ligada, voltagem);
        this.tamanho = tamanho;
    }
    @Override
    public void mudarCanal(){
        if(canal>9) {
            System.out.println("mudando canal... canal: 1");
        }else{
            System.out.println("mudando canal... canal: " + ++canal);}
    }
    @Override
    public void aumentarVolume(){
        if(volume>19) {
            System.out.println("volume no maximo!");
        }else{
            System.out.println("aumentando volume... volume: " + ++volume);}
    }
    @Override
    public void diminuirVolume(){
        if(volume<1) {
            System.out.println("volume no minimo!");
        }else{
            System.out.println("diminuindo volume... volume: " + --volume);}
    }
    @Override
    public void desligar(){setLigada(false);
        System.out.println("Desligando tv Sansung...");
    }
    @Override
    public void ligar(){ setLigada(true);
        System.out.println("ligando Tv Sansung...");
    }
    @Override
    public void Status(){
        System.out.println("Status da Sansung.");
        if (isLigada() == true) {
            System.out.println("estado: Ligada");
        }else{
            System.out.println("estado: desligada");}
        System.out.println("volume: " + volume);
        System.out.println("canal: " + canal);
    }

}
