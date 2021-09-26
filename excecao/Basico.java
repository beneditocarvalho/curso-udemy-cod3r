package cursoUdemyLeo.excecao;

import java.util.Arrays;
import java.util.function.Function;

public class Basico {

    public static void main(String[] args) {

        Aluno[] a1 = null;

        Function<Aluno, String> imprimiNome = a -> a.nome;


        try {
            imprimirNomeAluno(a1[0]);
        } catch (NullPointerException excecao) {
            System.out.println(excecao);
        }


        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            ;
        }

        System.out.println("FIM");

        try {
            Arrays.stream(a1).map(imprimiNome).forEach(System.out::print);
        } catch (NullPointerException exception) {
            System.out.println(exception);

        }
    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }


}