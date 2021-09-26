package cursoUdemyLeo.orientacaoObjeto.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double obterValorTotal() {
        double valor = 0;
        for (Compra compra : compras) {
            valor += compra.obterValorTotal();
        }
        return valor;
    }



}