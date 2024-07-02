package Lista9.eletrodomesticos;

public class Main {
    public static void main(String[] args) {
        ControleRemoto sansung = new Modelo1(false, 220, 120);
        ControleRemoto lg = new Modelo2(false, 110, 130);
        ControleRemoto radio = new Radio(false,220);

        System.out.println("\nTestando Sansung:");
        sansung.ligar();
        sansung.diminuirVolume();
        sansung.aumentarVolume();
        sansung.mudarCanal();
        sansung.diminuirVolume();
        sansung.desligar();
        System.out.println();
        sansung.Status();


        System.out.println("\nTestando Lg:");
        lg.ligar();
        lg.diminuirVolume();
        lg.aumentarVolume();
        lg.mudarCanal();
        lg.diminuirVolume();
        System.out.println();
        lg.Status();

        System.out.println("\nTestando Radio:");
        radio.ligar();
        radio.diminuirVolume();
        radio.aumentarVolume();
        radio.mudarSintonia();
        radio.diminuirVolume();
        System.out.println();
        radio.Status();

    }

}

