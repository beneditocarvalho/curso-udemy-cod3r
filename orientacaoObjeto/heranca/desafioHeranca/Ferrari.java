package cursoUdemyLeo.orientacaoObjeto.heranca.desafioHeranca;

public class Ferrari extends Carro {


    private final int potenciaMotor = 680;
    private String cambio;
    private String tipoMotor;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);

    }

    @Override
    public void acelerar() {
        super.velocidade += 15;
    }
}
