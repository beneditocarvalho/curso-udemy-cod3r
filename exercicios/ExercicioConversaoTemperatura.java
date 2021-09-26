package cursoUdemyLeo.exercicios;

import java.util.Scanner;

public class ExercicioConversaoTemperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double tempF = 0;      //(oC x 9) / 5) + 32
        double tempC = 0;

        System.out.println("Qual temperatura em Celsius: ");
        tempC = teclado.nextInt();

        tempF = ((tempC * 9) / 5) + 32;

        System.out.println("O resultado da temperatuda em Fahrenheit: " + tempF);

    }
}
