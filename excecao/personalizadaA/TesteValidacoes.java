package cursoUdemyLeo.excecao.personalizadaA;

import cursoUdemyLeo.excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno(" ", -7);
            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e);
        }

        System.out.println("FIM");

    }
}