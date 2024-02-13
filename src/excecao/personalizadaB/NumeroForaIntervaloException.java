package excecao.personalizadaB;

public class NumeroForaIntervaloException extends Exception {
    private final String nomeDoAtributo;

    NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo!", nomeDoAtributo);
    }
}
