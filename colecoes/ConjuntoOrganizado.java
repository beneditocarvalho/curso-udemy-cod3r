package cursoUdemyLeo.colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {

    public static void main(String[] args) {

       // HashSet<String> usuario = new HashSet<>();
        TreeSet<String> usuario = new TreeSet<>();
        usuario.add("Benedito");
        usuario.add("Vanessa");
        usuario.add("Bia");

        for(String nome : usuario){
            System.out.println(nome);
        }

        Set<Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(23);
        nums.add(7);
        nums.add(11);

        for(int a :nums) {
            System.out.println(a);
        }
    }
}
