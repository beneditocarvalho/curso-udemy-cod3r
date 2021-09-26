package cursoUdemyLeo.orientacaoObjeto.composicao;

public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra;


    Item(String nome, int qtde, double preco) {
        this.nome = nome;
        this.quantidade = qtde;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n Nome: " + nome + "\n " +
                "Qtde: " + quantidade + "\n " +
                "Preço: " + preco;
    }

}