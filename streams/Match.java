package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bene", 6.8);
        Aluno a2 = new Aluno("Dito", 6.5);
        Aluno a3 = new Aluno("José", 8.7);
        Aluno a4 = new Aluno("Carvalho", 7.5);
        Aluno a5 = new Aluno("Nunes", 7.3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));

    }
}