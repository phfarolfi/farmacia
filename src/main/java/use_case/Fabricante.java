package use_case;

import java.util.ArrayList;
import java.util.List;

public class Fabricante{
    private String nome;
    private List<Produto> produtos;

    Fabricante(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<Produto>(); 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
