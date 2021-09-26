package cursoUdemyLeo.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3900.00, 0.20);

        Function<Produto, Double> precoFinal =
                p -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> precoImposto =
                preco -> preco >= 2500 ? (preco * (1.085)) : (preco * 1);

        UnaryOperator<Double> precoFrete =
                preco -> preco >= 3000 ? (preco += 100) : (preco += 50);

        Function<Double, String> formatar =
                preco -> ("R$ " + preco).replace(".", ",");

        String resultadoFinal = precoFinal
                .andThen(precoImposto)
                .andThen(precoFrete)
                .andThen(formatar)
                .apply(p1);

        System.out.println(resultadoFinal);

    }

}