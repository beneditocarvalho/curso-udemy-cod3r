package cursoUdemyLeo.exercicios;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeAlunos = 0;
        int qtdeNotas = 0;
        double totalNotas = 0;

        System.out.print("Quantidade de alunos: ");
        qtdeAlunos = entrada.nextInt();
        System.out.print("Quantidade de notas por aluno: ");
        qtdeNotas = entrada.nextInt();

        double[][] notasAlunos = new double[qtdeAlunos][qtdeNotas];


        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print("Aluno " + (i + 1) + " nota " + (j + 1) + " :");
                notasAlunos[i][j] = entrada.nextDouble();
                totalNotas += notasAlunos[i][j];

            }
        }
        entrada.close();
        double media = totalNotas / (qtdeNotas * qtdeAlunos);
        System.out.println("A media das notas e: " + media);
    }
}