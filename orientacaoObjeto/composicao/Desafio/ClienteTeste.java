package cursoUdemyLeo.orientacaoObjeto.composicao.Desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Benedito");
        Compra compra1 = new Compra();

        compra1.adicionarItem("Sabao", 10.00, 3);
        compra1.adicionarItem("Arroz", 15.00, 2);
        compra1.adicionarItem("Feijao", 12.00, 5);

        Compra compra2 = new Compra();

        compra2.adicionarItem("Oleo", 6.00, 5);
        compra2.adicionarItem("Carne", 50.00, 1);
        compra2.adicionarItem("Pão", 5.00, 5);


        c1.adicionarCompra(compra1);
        c1.adicionarCompra(compra2);
        System.out.println(c1.compras);

        System.out.println(c1.obterValorTotal());

    }
}