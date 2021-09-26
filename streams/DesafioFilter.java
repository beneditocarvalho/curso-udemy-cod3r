package cursoUdemyLeo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        CarrosEsportivos c1 = new CarrosEsportivos("BMW", "M3", 480, 19);
        CarrosEsportivos c2 = new CarrosEsportivos("Mercedez", "E63", 600, 19);
        CarrosEsportivos c3 = new CarrosEsportivos("AUDI", "RS8", 500, 19);
        CarrosEsportivos c4 = new CarrosEsportivos("CHEVROLET", "CAMARO", 420, 18);
        CarrosEsportivos c5 = new CarrosEsportivos("FORD", "Mustang", 400, 18);

        List<CarrosEsportivos> showRoom = Arrays.asList(c1, c2, c3, c4, c5);

        Consumer<String> imprimir = System.out::println;

        Predicate<CarrosEsportivos> isPotente = potencia -> potencia.hp > 450;

        Predicate<CarrosEsportivos> melhorRoda = roda -> roda.rodas > 18;

        Function<CarrosEsportivos, String> osMelhores = c -> "Os melhores são " + c.marca + " - " + c.modelo;

        showRoom.stream()
                .filter(isPotente)
                .filter(melhorRoda)
                .map(osMelhores)
                .forEach(imprimir);
    }
}