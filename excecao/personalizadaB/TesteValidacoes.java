package cursoUdemyLeo.excecao.personalizadaB;

import cursoUdemyLeo.excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno(" ", -7);
            Validar.aluno(aluno);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM");

    }
}