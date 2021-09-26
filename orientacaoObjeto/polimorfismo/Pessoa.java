package cursoUdemyLeo.orientacaoObjeto.polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso) {

        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
    }
}
