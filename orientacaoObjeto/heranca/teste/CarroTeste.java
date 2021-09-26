package cursoUdemyLeo.orientacaoObjeto.heranca.teste;

import cursoUdemyLeo.orientacaoObjeto.heranca.desafioHeranca.BMW;
import cursoUdemyLeo.orientacaoObjeto.heranca.desafioHeranca.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Ferrari f355 = new Ferrari(350);
        f355.ligar();
        f355.acelerar();
        f355.acelerar();
        f355.acelerar();
        f355.acelerar();
        System.out.println(f355);
        f355.frear();
        f355.frear();
        f355.frear();
        System.out.println(f355);

        BMW m3 = new BMW(350);
        m3.ligar();
        m3.acelerar();
        m3.acelerar();
        m3.acelerar();
        m3.acelerar();

        System.out.println(m3);

    }
}