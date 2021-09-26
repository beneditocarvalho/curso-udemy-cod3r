package cursoUdemyLeo.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome + "!!" + " " + p.preco); // -> funcao lambda

        // Interface funcional Consumer recebe parametro e não retorna nada

        Produto p1 = new Produto("Caneta", 12.30, 0.1);
        Produto p2 = new Produto("Notebook", 3500.00, 0.3);
        Produto p3 = new Produto("Caderno", 19.90, 0.03);
        Produto p4 = new Produto("Borracha", 7.50, 0.2);
        Produto p5 = new Produto("Lapis", 7.50, 0.15);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        imprimirNome.accept(p1);
        imprimirNome.accept(p2);

        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(imprimirNome);


    }
}