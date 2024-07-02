package Lista9.eletrodomesticos;

public interface ControleRemoto {

    public default void mudarSintonia(){}
    public default void mudarCanal(){}
    public default void aumentarVolume(){}
    public default void diminuirVolume(){}
    public default void desligar(){}
    public default void ligar(){}
    public default void Status(){}

}
