package use_case;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;
    private String telefone;
    private String email;
    private List<Fabricante> fabricantes;

    Fornecedor(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.fabricantes = new ArrayList<Fabricante>(); 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public List<Fabricante> getFabricantes() {
        return this.fabricantes;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarFabricante(Fabricante fabricante) {
        this.fabricantes.add(fabricante);
    }
}
