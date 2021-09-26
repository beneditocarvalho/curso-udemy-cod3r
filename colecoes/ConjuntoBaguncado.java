package cursoUdemyLeo.colecoes;

import java.util.HashSet;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add("teste");
        conjunto.add(10.25);
        conjunto.add(true);
        conjunto.add('x');

        System.out.println("Size " + conjunto.size());

        System.out.println("Contais 10.25" + conjunto.contains(10.25));

        System.out.println("Remove 10.25" + conjunto.remove(10.25));

        System.out.println("Contais 10.25" + conjunto.contains(10.25));

        HashSet conjunto2 = new HashSet();

        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(3);

        conjunto.addAll(conjunto2);
        System.out.println(conjunto);
        System.out.println("Size" + conjunto.size());

        conjunto.retainAll(conjunto2);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }

}
