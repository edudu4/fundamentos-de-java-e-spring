package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        // Era Unix
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1,1,1970); // chama o construtor da linha 8
    }

    String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }

    String obterDataFormatada(int diasDescanso) {
        return String.format("%d/%d/%d", dia + diasDescanso, mes, ano);
    }
}
