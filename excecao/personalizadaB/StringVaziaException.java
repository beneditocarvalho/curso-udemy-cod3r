package cursoUdemyLeo.excecao.personalizadaB;

public class StringVaziaException extends Exception {

    public String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);
    }

}
