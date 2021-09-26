package cursoUdemyLeo.exercicios;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("TV 50", 10000.00);
        System.out.println(p1.precoDescontoGerente(0.25));


        Produto p2 = new Produto();
        p2.nome = "Notebook";
        p2.preco = 10000.00;
        System.out.println(p2.precoComDesconto());

        Produto p3 = new Produto("Celular", 10000.00);
        System.out.println(p3.precoComDesconto());

        System.out.println("Criterio preco e igual?: " + p1.equals(p2));


    }
}