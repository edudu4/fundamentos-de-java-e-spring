package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

//        Erro de compilação, pois está tentando acessar uma variável local não inicializada
//        int a;
//        System.out.println(a);
//
//        Erro em tempo de execução, pois está tentando acessar um valor nulo sem apontamento
//        Data d1 = null;
//        d1.mes = 3;
//        String s2 = null;
//        System.out.println(s2.concat("????"));
    }
}
