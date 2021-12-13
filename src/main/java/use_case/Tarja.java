package use_case;

public class Tarja {
    private String nome;
    private boolean precisaReceita;

    Tarja(String nome, boolean precisaReceita){
        this.nome = nome;
        this.precisaReceita = precisaReceita;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean getPrecisaReceita() {
        return this.precisaReceita;
    }
}
