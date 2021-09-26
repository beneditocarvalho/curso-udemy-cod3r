package cursoUdemyLeo.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> pilha = new ArrayDeque<String>();

        pilha.push("Benedito");
        pilha.push("Carvalho");
        pilha.push("Nunes");
        pilha.push("Vanessa");

        System.out.println(pilha.element());

        System.out.println(pilha.peek());
        System.out.println(pilha.poll());

        System.out.println("-------------");

        for(String nomes : pilha){
            System.out.println(nomes);
        }

    }
}
