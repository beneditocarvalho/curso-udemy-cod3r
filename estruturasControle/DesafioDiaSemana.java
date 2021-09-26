package cursoUdemyLeo.estruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero de 1 a 7: ");
        int dia = teclado.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Numero invalido");
        } else if (dia == 1) {
            System.out.println("Segunda-feira");
        } else if (dia == 2) {
            System.out.println("Terca-feira");
        } else if (dia == 3) {
            System.out.println("Quarta-feira");
        } else if (dia == 4) {
            System.out.println("Quinta-feira");
        } else if (dia == 5) {
            System.out.println("Sexta-feira");
        } else if (dia == 6) {
            System.out.println("Sabado");
        } else {
            System.out.println("Domingo");
        }

        /* switch (dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terca");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }
        */

    }
}
