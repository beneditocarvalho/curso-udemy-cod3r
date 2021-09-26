package cursoUdemyLeo.orientacaoObjeto.desafioComida;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nome, double peso){
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
    }

    void comer(Comida comida) {
        this.pesoPessoa += comida.pesoComida;
    }


    //CRIAR METODO COMER RECEBERA OUTRO OBJETO DA CLASSE COMIDA
    //ACRESCENTAR O PESO DA COMIDA AO PESO DA PESSOA

}
