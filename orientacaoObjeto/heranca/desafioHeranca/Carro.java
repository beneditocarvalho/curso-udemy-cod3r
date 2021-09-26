package cursoUdemyLeo.orientacaoObjeto.heranca.desafioHeranca;

public abstract class Carro {

    protected final int VELOCIDADE_MAXIMA;
    public double velocidade;
    private boolean ligado = false;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        }
        velocidade += delta;
    }

    public void frear() {
        if (velocidade < 5) {
            ligado = false;
            System.out.println("Carro Parado!");
        }
        System.out.println("Freou");
        velocidade -= 5;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro Ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado");
    }

    @Override
    public String toString() {
        return "A velocidade atual é " + velocidade;
    }
}
