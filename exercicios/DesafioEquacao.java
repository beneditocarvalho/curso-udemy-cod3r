package cursoUdemyLeo.exercicios;

public class DesafioEquacao {
    public static void main(String[] args) {
        double equacao1 = 6 * (3 + 2);
        double equacao2 = (1-5) * (2-7);
        double equacao1Quad = Math.pow(equacao1,2) / (3 * 2);
        double equacao2Quad = Math.pow((equacao2 / 2),2);
        double resultEquacaoCubo = Math.pow((equacao1Quad-equacao2Quad),3);
        double denominador = Math.pow(10,3);
        double resultFinal = resultEquacaoCubo / denominador;

        System.out.println(equacao1);
        System.out.println(equacao2);
        System.out.println(equacao1Quad);
        System.out.println(equacao2Quad);
        System.out.println(resultFinal);
    }
}
