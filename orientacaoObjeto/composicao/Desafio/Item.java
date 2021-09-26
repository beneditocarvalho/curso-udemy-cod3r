package cursoUdemyLeo.orientacaoObjeto.composicao.Desafio;

public class Item {

    Produto produto;
    int quantidade;

    Item(Produto produto, int qtde) {
        this.produto = produto;
        this.quantidade = qtde;
    }

    @Override
    public String toString() {
        return produto + " Quantidade = " + quantidade;
    }
}
