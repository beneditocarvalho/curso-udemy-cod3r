package cursoUdemyLeo.excecao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException {

    public String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {

        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
    }

}
