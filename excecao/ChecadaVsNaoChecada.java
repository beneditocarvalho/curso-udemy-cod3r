package cursoUdemyLeo.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM: ");

    }

    //não checada ou não verificada (pode ou não tratar o erro)
    static void geraErro1() throws RuntimeException {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    //excecao checada ou verificada (nao compila)
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02!");
    }

}