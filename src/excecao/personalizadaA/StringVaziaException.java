package excecao.personalizadaA;

public class StringVaziaException extends RuntimeException {
    private final String nomeDoAtributo;

    StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está vazio!", nomeDoAtributo);
    }
}
