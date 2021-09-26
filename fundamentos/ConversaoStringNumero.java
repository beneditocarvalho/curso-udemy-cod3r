package cursoUdemyLeo.fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
        System.out.println("Valor como String -> " + valor1 + valor2);

        Integer num1 = Integer.parseInt(valor1);
        Integer num2 = Integer.parseInt(valor2);
        System.out.println(" Soma do valor como inteiro - > " + (num1 + num2));

    }
}
