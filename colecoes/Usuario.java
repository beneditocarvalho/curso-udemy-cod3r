package cursoUdemyLeo.colecoes;

public class Usuario {

    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome e: " + this.nome;
    }

}
