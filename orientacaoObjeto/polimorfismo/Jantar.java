package cursoUdemyLeo.orientacaoObjeto.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(90.00);
        Arroz arroz = new Arroz(0.2);
        Feijao feijao = new Feijao(0.1);
        Comida sorvete = new Sorvete(0.2);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);

        System.out.println(convidado.getPeso());



    }

}