package cursoUdemyLeo.orientacaoObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Item> itens = new ArrayList<>();


    void  adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    void adicionarItem (String nome, int qtde, double preco){
        this.adicionarItem(new Item(nome, qtde, preco));
    }

    double obterValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.preco * item.quantidade;
        }
        return valorTotal;
    }


}