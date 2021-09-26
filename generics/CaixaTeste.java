package cursoUdemyLeo.generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("teste");

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.3);

        Caixa<Integer> caixaC = new Caixa<>();
        caixaC.guardar(23);

        Caixa<Boolean> caixaD = new Caixa<>();
        caixaD.guardar(true);

    }
}
