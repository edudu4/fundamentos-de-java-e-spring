package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia,mes,ano);
    }
    String obterDataFormatada(int diasDescanso) {
        return String.format("%d/%d/%d", dia + diasDescanso,mes,ano);
    }
}
