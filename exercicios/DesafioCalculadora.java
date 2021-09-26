package cursoUdemyLeo.exercicios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        Double num1 = teclado.nextDouble();
        System.out.println("Informe o segundo numero: ");
        Double num2 = teclado.nextDouble();
        System.out.println("Informe qual operacao deseja realiar: ");
        String operadorTexto = teclado.next();

        Double resultado = "+".equals(operadorTexto) ? num1 + num2 : 0;
        resultado = "-".equals(operadorTexto) ? num1 - num2 : resultado;
        resultado = "*".equals(operadorTexto) ? num1 * num2 : resultado;
        resultado = "/".equals(operadorTexto) ? num1 / num2 : resultado;

        teclado.close();

        System.out.println(num1 + " " + operadorTexto + " " + num2 + " = " + resultado);
    }

}