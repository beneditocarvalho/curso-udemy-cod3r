package cursoUdemyLeo.lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro =
                produto -> (produto.preco * (1 - produto.desconto)) >= 750; // -> funcao lambda

        // Functional Interface Predicate recebe um parametro e retorna true or false

        Produto produto = new Produto("Notebook", 3500.00,0.3);
        System.out.println(isCaro.test(produto));

    }
}
