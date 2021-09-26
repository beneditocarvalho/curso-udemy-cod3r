package cursoUdemyLeo.orientacaoObjeto.composicao.Desafio;

public class Produto {

    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " Preço = " + preco;
    }
}
