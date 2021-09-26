package cursoUdemyLeo.orientacaoObjeto.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Benedito");
        Aluno aluno2 = new Aluno("Jose");

        Curso curso1 = new Curso("JAVA");
        Curso curso2 = new Curso("SPRING");

        aluno1.adicionarCurso(new Curso("JAVA"));
    }

}
