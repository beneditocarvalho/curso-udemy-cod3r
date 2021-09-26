package cursoUdemyLeo.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste1 {

    public static void main(String[] args) {

        Calculo calc = (x, y) -> x + y; //lambda expression utilizando functional interface

        System.out.println(calc.executar(2.0, 3.0));

        calc = (x, y) -> x * y; //lambda expression utilizando functional interface

        System.out.println(calc.executar(3.0, 2.0));

        System.out.println(calc.teste());

        calc = (x,y) -> x / y;

        System.out.println(calc.executar(15,5));

        BinaryOperator<Double> calcTeste = (x,y) ->  {return x * y;}; // java function

        System.out.println(calcTeste.apply(3.0,5.0));

        // chamando metodo apply do Objeto (BynaryOperator) da classe java function

        calcTeste = (a,b) -> a / b;

        System.out.println(calcTeste.apply(15.0,3.0));

    }

}