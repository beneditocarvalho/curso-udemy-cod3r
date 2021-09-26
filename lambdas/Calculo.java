package cursoUdemyLeo.lambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    //interface funcional tem apenas 1 metodo/função abstrata

    default String teste() {
        return "teste";
    } //a interface continua com apenas 1 metodo abstrato pois foi utilizado default

}