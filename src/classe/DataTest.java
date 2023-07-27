package classe;

public class DataTest {
    public static void main(String[] args) {
        Data dataHoje = new Data();
        dataHoje.dia = 27;
        dataHoje.mes = 7;
        dataHoje.ano = 2023;
        String dataHojeFormatada = dataHoje.obterDataFormatada();

        Data dataEsperada = new Data();
        dataEsperada.dia = 23;
        dataEsperada.mes = 8;
        dataEsperada.ano = 2023;
        String dataEsperadaFormatada = dataEsperada.obterDataFormatada(6);

        System.out.printf("Hoje é dia %s\n", dataHojeFormatada);
        System.out.printf("Planejo concluir o curso na data %s", dataEsperadaFormatada);

       /* Implementação antiga
       int diasDescanso = 6;
        System.out.printf("Hoje é dia %d do mês 0%d do ano de %d\n"
                , dataHoje.dia, dataHoje.mes, dataHoje.ano);
        System.out.printf("Planejo concluir o curso na data %d/%d/%d",
                dataEsperada.dia + diasDescanso, dataEsperada.mes, dataEsperada.ano);
        */
    }
}
