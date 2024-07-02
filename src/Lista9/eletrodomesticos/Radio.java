package Lista9.eletrodomesticos;

import Lista7.CdPlayer.TestaCD;

public class Radio extends Eletrodomestico implements ControleRemoto {

    private short am = 1;
    private short fm = 2;

    private int banda;
    private float sintonia = 107;

    public int volume = 20;

    public Radio(boolean ligada, int voltagem) {
        super(ligada, voltagem);
    }

    public void mudarSintonia() {
        if (sintonia > 138) {
            sintonia = 96;
            System.out.println("mudando a radio... FM: " + sintonia);
        } else {
            System.out.println("mudando a radio... FM: " + ++sintonia);
        }
    }
    @Override
    public void aumentarVolume() {
        if (volume > 19) {
            System.out.println("volume no maximo!");
        } else {
            System.out.println("aumentando volume... volume: " + ++volume);
        }
    }
    @Override
    public void diminuirVolume() {
        if (volume < 1) {
            System.out.println("volume no minimo!");
        } else {
            System.out.println("diminuindo volume... volume: " + --volume);
        }
    }
    @Override
    public void desligar() {setLigada(false);
        System.out.println("Desligando radio...");
    }
    @Override
    public void ligar() {setLigada(true);
        System.out.println("ligando Tv radio...");
    }
    @Override
    public void Status(){
        System.out.println("Status do radio.");
        if (isLigada() == true) {
            System.out.println("estado: Ligada");
        }else{
            System.out.println("estado: desligada");}
        System.out.println("volume: " + volume);
        System.out.println("sintonia: " + sintonia);
    }
}
