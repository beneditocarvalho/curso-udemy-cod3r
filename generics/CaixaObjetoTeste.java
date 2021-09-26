package cursoUdemyLeo.generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

//        Integer coisa = (Integer) caixaA.abrir(); // cast não pode ser feito devido tipo primitivo double
//        System.out.println(coisa);

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }

}