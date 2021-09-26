package cursoUdemyLeo.orientacaoObjeto.heranca.desafioHeranca;

public class BMW extends Carro {

    private final int potenciaMotor = 420;
    private String cambio;
    private String tipoMotor;

    public BMW(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }
}
