package use_case;

public class PrincipioAtivo {
    private String nome;

    PrincipioAtivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
