package cursoUdemyLeo.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // centralizar na tela do PC

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

//        botao.addActionListener(e -> {
//            System.out.println("Fumegou!!");
//        });

        botao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Ocorreu evento!!");

            }
        });

        janela.setVisible(true);

    }
}
