package cursoUdemyLeo.orientacaoObjeto.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double preco, int qtde) {
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double obterValorTotal() {
        double valor = 0;
        for (Item item : itens) {
            valor += item.quantidade * item.produto.preco;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Itens " + itens + " - ";
    }
}