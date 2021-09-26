package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Teste ", "Stream ", "Arrays ", "Usablidade\n");
        langs.forEach(print);

        String[] maisLangs = {"Teste2 ", "Stream ", "Arrays ", "Usabilidade\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);

        List<String> outrasLangs = Arrays.asList("Teste3 ", "Stream ", "Arrays ", "Usabilidade\n");
        outrasLangs.stream().forEach(print);

    }
}