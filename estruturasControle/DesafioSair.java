package cursoUdemyLeo.estruturasControle;

import java.util.Scanner;

public class DesafioSair {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha = "";

        while (!senha.equalsIgnoreCase("sair")){
            System.out.println("Senha: ");
            senha = teclado.nextLine();
        }
        teclado.close();
    }
}
