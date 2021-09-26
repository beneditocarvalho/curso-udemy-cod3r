package cursoUdemyLeo.orientacaoObjeto.heranca.desafioHeranca;

public class CarroTeste {

    public static void main(String[] args) {

        CarroMotor nivus = new CarroMotor();

        System.out.println(nivus.estaLigado());

        nivus.ligar();

        System.out.println(nivus.estaLigado());
        System.out.println(nivus.motor.giros());

        nivus.acelerar();
        nivus.acelerar();
        nivus.acelerar();

        System.out.println(nivus.motor.giros());

        nivus.frear();
        nivus.frear();
        nivus.frear();
        nivus.frear();

        System.out.println(nivus.motor.giros());


    }

}
