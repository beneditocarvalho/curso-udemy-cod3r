package cursoUdemyLeo.exercicios;

import java.util.Objects;

public class Produto {

    String nome;
    double preco;
    final static double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoDescontoGerente(double descontoGerente) {
        return preco * (1 - (desconto + descontoGerente));
    }


    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Produto produto = (Produto) objeto;
        return Double.compare(produto.preco, preco) == 0 && Objects.equals(nome, produto.nome);
    }

    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    //    public boolean equals(Object objeto) {
//        Produto produto = (Produto) objeto;
//        if (this.preco == produto.preco) return true;
//        if (produto.preco == 0 || getClass() != objeto.getClass()) return false;
//        return Double.compare(produto.preco, preco) == 0;
//    }
//
//
//    public int hashCode() {
//        return Objects.hash(preco);
//    }

}