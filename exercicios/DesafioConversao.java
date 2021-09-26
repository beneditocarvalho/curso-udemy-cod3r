package cursoUdemyLeo.exercicios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor do Primeiro Salario: ");
        String salario1 = teclado.nextLine().replace(",",".");
        System.out.println("Valor do Segundo Salario: ");
        String salario2 = teclado.nextLine().replace(",",".");
        System.out.println("Valor do Terceiro Salario: ");
        String salario3 = teclado.nextLine().replace(",",".");

        teclado.close();

        Double num1 = Double.parseDouble(salario1);
        Double num2 = Double.parseDouble(salario2);
        Double num3 = Double.parseDouble(salario3);

        double resultado = (num1 + num2 + num3 ) / 3;

        System.out.println("A media salarial e: " + resultado);
    }
}
