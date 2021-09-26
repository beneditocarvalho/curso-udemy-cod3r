package cursoUdemyLeo.orientacaoObjeto.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();

        c1.cliente = "Benedito";
        c1.itens.add(new Item("Arroz", 1, 15.00));
        c1.itens.add(new Item("Feijao", 1, 12.00));
        c1.adicionarItem("Carne", 2, 20.00);

        System.out.println(c1.itens);

        System.out.println("get index >>> " + c1.itens.get(2));

        System.out.println("VALOR TOTAL >>>> " + c1.obterValorTotal());

        System.out.println("remove index 1  >>>>> " + c1.itens.remove(1));

        System.out.println("*" + c1.itens);

        System.out.println("VALOR TOTAL >>>> " + c1.obterValorTotal());

        c1.adicionarItem(new Item("Cebola", 3, 5.00));
        c1.adicionarItem(new Item("Alho", 5, 3.00));
        c1.adicionarItem("Macarrao", 1, 15.00);

        System.out.println(c1.itens);
        System.out.println("VALOR TOTAL >>>> " + c1.obterValorTotal());


    }

}