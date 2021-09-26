package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bene", 7.5);
        Aluno a2 = new Aluno("Dito", 7.8);
        Aluno a3 = new Aluno("José", 8.7);
        Aluno a4 = new Aluno("Carvalho", 7.5);
        Aluno a5 = new Aluno("Nunes", 7.3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Function<Aluno, Double> getNota = n -> n.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                Media::combinar;

        Media media = alunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(new Media(), calcularMedia, combinarMedia); //reduce (valor inicial, acumulador, combinador)

        System.out.println(media.getValor());

    }
}