package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bene", 6.8);
        Aluno a2 = new Aluno("Dito", 6.5);
        Aluno a3 = new Aluno("José", 8.7);
        Aluno a4 = new Aluno("Carvalho", 7.5);
        Aluno a5 = new Aluno("Nunes", 7.3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

//        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
//            if (aluno1.nota > aluno2.nota) return 1;
//            if (aluno1.nota < aluno2.nota) return -1;
//            return 0;
//        };

        System.out.println(alunos.stream().max((aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        }));

        System.out.println(alunos.stream().min((aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return -1;
            if (aluno1.nota < aluno2.nota) return 1;
            return 0;
        }));

    }
}