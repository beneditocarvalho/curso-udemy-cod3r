package cursoUdemyLeo.orientacaoObjeto.desafioComida;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Benedito", 90.00);

        Comida refeicao1 = new Comida("Lasanha", 0.200);
        Comida refeicao2 = new Comida("Macarrao", 0.300);

        System.out.println("Antes da refeicao o peso e: " + p1.pesoPessoa);

        p1.comer(refeicao1);

        System.out.println("Apos refeicao" + " de " + refeicao1.nomeComida +
                " o peso aumentou para: " + p1.pesoPessoa);

        p1.comer(refeicao2);

        System.out.println("Apos refeicao" + " de " + refeicao2.nomeComida +
                " o peso aumentou para: " + p1.pesoPessoa);


        //CRIAR UMA PESSOA
        //INSTANCIAR ESSA PESSOA
        //INSTANCIAR 2 COMIDAS
        //PESSOA COME A COMIDA E AUMENTA O PESO

    }
}
