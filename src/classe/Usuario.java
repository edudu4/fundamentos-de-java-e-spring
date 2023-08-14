package classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object obj) {

        if (obj instanceof Usuario) {

            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }

    }

    // Hashcode será abordado em outra aula!
    public int hashCode() {
        return 0;
    }
}
