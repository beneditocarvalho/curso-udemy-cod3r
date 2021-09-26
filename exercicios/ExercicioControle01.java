package cursoUdemyLeo.exercicios;

import java.util.Scanner;

public class ExercicioControle01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        while (numero > 0 || numero < 11) {
            System.out.println("Digite um numero de 0 a 10: ");
            numero = teclado.nextInt();
            if (numero <= 0 || numero > 10) {
                System.out.println("Numero invalido!");
                break;
            } else if (numero % 2 == 0) {
                System.out.println("O numero e par!");
            } else {
                System.out.println("O numero e impar!");
            }
        }
        System.out.println("FIM!");
    }
}
