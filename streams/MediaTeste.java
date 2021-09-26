package cursoUdemyLeo.streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media();
        m1.adicionar(7.8);
        m1.adicionar(8.2);

        Media m2 = new Media();
        m2.adicionar(9.2);
        m2.adicionar(8.5);

        Media mediaGeral = new Media();

        System.out.println(mediaGeral.combinar(m1, m2).getValor());
    }
}
