package cursoUdemyLeo.exercicios;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        String dataFormatada = dia + "/" + mes + "/" + ano;
        return  dataFormatada;
    }

    Data (){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data (int d,int m,int a){
        dia = d;
        mes = m;
        ano = a;
    }

}
