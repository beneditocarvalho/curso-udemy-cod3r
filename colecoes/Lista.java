package cursoUdemyLeo.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Benedito");
        lista.add(u1);
        lista.add(new Usuario("Carvalho"));
        lista.add(new Usuario("Nunes"));
        lista.add(new Usuario("Benedito-"));
        lista.add(new Usuario("Vanessa"));
        lista.add(new Usuario("Vanessa"));

        for (Usuario listaNome : lista) {
            System.out.println(listaNome);
        }

        System.out.println("---------------------");
        System.out.println("Posicao 2: " + lista.get(2)); // acessar pelo índice

        lista.remove(new Usuario("Nunes"));
        lista.remove(new Usuario("Benedito"));
        lista.remove(new Usuario("Vanessa"));

        System.out.println(lista.contains(new Usuario("Nunes")));
        System.out.println("Posicao 2: " + lista.get(2));

        for (Usuario listaFinal : lista) {
            System.out.println(listaFinal);
        }
    }
}