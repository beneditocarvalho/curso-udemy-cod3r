package cursoUdemyLeo.exercicios;

public class DataTeste {
    public static void main(String[] args) {

        Data primeiraData = new Data(23,8,1978);
        System.out.println(primeiraData.obterDataFormatada());

        Data segundaData = new Data();
        System.out.println(segundaData.obterDataFormatada());
    }
}
