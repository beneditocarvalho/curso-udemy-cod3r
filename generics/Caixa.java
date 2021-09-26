package cursoUdemyLeo.generics;

public class Caixa<TIPO> {

    private TIPO coisa;

    public void guardar(TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO abrir() {
        return coisa;
    }

    @Override
    public String toString() {
        return "Caixa - " +
                coisa;
    }
}
