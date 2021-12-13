package use_case;

public class Funcionario{
    private String nome;
    private String endereco;
    private String telefone;
    private String usuario;
    private String senha;

    Funcionario(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerarCredencial();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void gerarCredencial(){
        // alterar aqui
        this.usuario = "admin";
        this.senha = "admin";
    }
    
}
