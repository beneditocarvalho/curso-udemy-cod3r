package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Benedito", "José", "Carvalho", "Nunes");

        for (String nome : aprovados) { // usando for para imprimir
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        Iterator<String> it = aprovados.iterator(); // usando iterator para imprimir
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------------");

//        Stream<String> st = aprovados.stream(); // usando stream para imprimir
//        st.forEach(System.out::println);

        System.out.println("________________________");

        aprovados.stream().forEach(System.out::println);
    }
}