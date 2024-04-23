package Lista1;

import java.util.Scanner;

public class Lista06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //°C pra °F = 5 . (TempFahrenheit – 32) : 9.

        float tempCelsius, tempFahrenheit;

        System.out.print("digite um temperatura em Fahrenheit (°F): ");
        tempFahrenheit = ler.nextFloat();

        tempCelsius = (float) (5 * ((tempFahrenheit - 32) / 9));

        System.out.printf("A temperatura convertida em Celsius é: %.1f", tempCelsius);
    }
}
