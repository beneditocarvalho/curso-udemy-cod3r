package cursoUdemyLeo.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Benedito"); // fila cheia retorna false
        fila.add("Ana");
        fila.add("Vanessa");
        fila.offer("Carvalho"); // fila cheia retorna exceção
        fila.offer("Nunes");
        fila.offer("Pelaquim");

        for(String listInicial : fila){
            System.out.println(listInicial);
        }

        System.out.println("-------------------------------------------------");

        System.out.println("peek pegou o 1 da fila sem remover: " + fila.peek()); // fila vazia retorna null

        System.out.println("element pegou o 1 da fila sem remover: " + fila.element()); // fila vazia retorna exceção

        System.out.println("poll pegou o 1 da fila e removeu: " + fila.poll());
        System.out.println("poll pegou o 1 da fila e removeu: " + fila.poll());
        System.out.println("poll pegou o 1 da fila e removeu: " + fila.poll());

        System.out.println("--------------------------------------------------|");

        for(String filaFinal : fila){
            System.out.println(filaFinal);
        }

    }
}
