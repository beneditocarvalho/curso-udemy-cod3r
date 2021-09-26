package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<Integer> imprimirInteiro =
                numero -> System.out.print(numero.toString() + "     ");

        Consumer<String> imprimirBinario =
                numero -> System.out.print(numero + "-");

        Consumer<String> imprimir = System.out::print;

        Function<Integer, String> conversao = num -> Integer.toBinaryString(num);

        Function<String, String> inversao = num -> new StringBuilder(num).reverse().toString();

        nums.stream().forEach(imprimirInteiro);

        nums.stream().map(conversao).forEach(imprimirBinario);

        nums.stream().map(conversao).map(inversao).forEach(imprimirBinario);

        nums.stream()
                .map(conversao)
                .map(inversao)
                .forEach(imprimir);
    }

}