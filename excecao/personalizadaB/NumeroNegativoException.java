package cursoUdemyLeo.excecao.personalizadaB;

public class NumeroNegativoException extends Exception {

    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está negativo", nomeDoAtributo);
    }

}
