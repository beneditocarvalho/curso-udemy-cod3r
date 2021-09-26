package cursoUdemyLeo.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Benedito");
        mapa.put(2, "Vanessa");
        mapa.put(3, "Ana");
        mapa.put(4, "Carvalho");
        mapa.put(5, "Nunes");

        System.out.println(mapa.entrySet() + " - EntrySet");

        System.out.println(mapa.get(5) + " - get a chave");

        mapa.put(2, "Cristina");

        System.out.println("Removeu so com chave >>> " + mapa.remove(2));

        System.out.println(mapa.entrySet() + " - EntrySet");

        System.out.println("Removeu com chave e valor >>> " + mapa.remove(3, "Ana"));

        System.out.println(mapa.keySet() + " - keySet");

        System.out.println(mapa.values() + " - values");

        Map<Integer, Usuario> usuarios = new HashMap<>();

        usuarios.put(10, new Usuario("Benedito"));

        System.out.println(usuarios.values());


    }
}