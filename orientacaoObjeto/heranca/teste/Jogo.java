package cursoUdemyLeo.orientacaoObjeto.heranca.teste;

import cursoUdemyLeo.orientacaoObjeto.heranca.Direcao;
import cursoUdemyLeo.orientacaoObjeto.heranca.Heroi;
import cursoUdemyLeo.orientacaoObjeto.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Heroi j1 = new Heroi(10,10);
        Monstro j2 = new Monstro(10,11);

        j1.andar(Direcao.SUL);
        j1.getPosicao();

        j2.andar(Direcao.SUL);
        j2.getPosicao();

        System.out.println("ataque" + j1.atacar(j2));
        System.out.println("ataque" + j1.atacar(j2));


        System.out.println("Monstro life: " + j2.getVida());

        System.out.println("ataque" + j2.atacar(j1));
        System.out.println("ataque" + j2.atacar(j1));

        System.out.println("Heroi life: " + j1.getVida());

    }

}