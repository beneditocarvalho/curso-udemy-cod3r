package cursoUdemyLeo.lambdas;

import java.util.function.Function;

public class Desafio2 {

    public static void main(String[] args) {

        Produto p = new Produto("Celular", 3600, 0.3);

        Function<Produto, Double> precoDesconto =
                desconto -> p.preco * (1 - p.desconto);

        Function<Double, Double> impostoMunicipal =
                imposto -> imposto >= 2500.00 ? (imposto * 1.085) : imposto;

        Function<Double, Double> precoFrete =
                frete -> frete >= 2500 ? frete + 100 : frete + 50;

        Function<Double, String> formatarPreco =
                formatar -> ("R$ " + formatar).replace(".", ",");

        String resultado = precoDesconto
                .andThen(impostoMunicipal)
                .andThen(precoFrete)
                .andThen(formatarPreco)
                .apply(p);

        System.out.println(resultado);
    }
}