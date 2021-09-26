package cursoUdemyLeo.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bene", "José", "Carvalho", "Nunes");

        aprovados.forEach(nome -> System.out.println(nome)); // Foreach com expressão Lambda

        System.out.println("----------------------");

        aprovados.forEach(System.out::println); // Foreach com Method Reference

        System.out.println("---------------------");

        aprovados.forEach(nome -> meuImprimir(nome)); // Foreach expressão lambda chamando o método criado

        System.out.println("-----------------------");

        aprovados.forEach(Foreach::meuImprimir); // Foreach com Method Reference

    }

    static void meuImprimir (String nome) {
        System.out.println("Olá, meu nome é " + nome);
    }

}