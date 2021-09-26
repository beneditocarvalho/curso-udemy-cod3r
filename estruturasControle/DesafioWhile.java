package cursoUdemyLeo.estruturasControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean sair = true;
        int notas;
        int contador = 0;
        int notasTotal = 0;

        while (sair) {
            System.out.println("Digite a nota: ");
            notas = entrada.nextInt();
            if (notas == -1) {
                sair = false;
            } else if (notas >= 0 && notas <= 10) {
                notasTotal += notas;
                contador++;
            } else {
                System.out.println("NOTA INVALIDA!");
            }
        }
        entrada.close();
        System.out.println("Total notas e: " + notasTotal);
        System.out.println("A quantidade de notas e: " + contador);
        System.out.println("A media de notas e: " + (notasTotal / contador));
        System.out.println("SAIU");
    }
}