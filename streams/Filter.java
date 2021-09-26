package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bene", 7.8);
        Aluno a2 = new Aluno("Dito", 8.2);
        Aluno a3 = new Aluno("José", 7.5);
        Aluno a4 = new Aluno("Carvalho", 6.8);
        Aluno a5 = new Aluno("Nunes", 6.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Consumer<String> imprimir = System.out::println;

        Predicate<Aluno> aprovado = teste -> teste.nota >= 7.0;

        Function<Aluno, String> viva = feliz -> "VIVA " + feliz.nome + "!!";

        alunos.stream()
                .filter(aprovado)
                .map(viva)
                .forEach(imprimir);
    }
}