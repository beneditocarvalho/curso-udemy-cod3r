package cursoUdemyLeo.streams;

public class CarrosEsportivos {

    final String marca;
    final String modelo;
    final double hp;
    final int rodas;

    public CarrosEsportivos(String marca, String modelo, double hp, int rodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.hp = hp;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "CarrosEsportivos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", hp=" + hp +
                ", rodas=" + rodas +
                '}';
    }
}
