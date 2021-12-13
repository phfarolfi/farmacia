package use_case;

import java.util.List;

public class ItemEstoque {
    private int quantidade;
    private Produto produto;

    // PRODUTO
    ItemEstoque(String nome, String descricao, double preco, CategoriaProduto categoria, Fabricante fabricante, int quantidade) {
        this.produto = new Produto(nome, descricao, preco, categoria, fabricante);
        this.quantidade = quantidade;
    }

    // MEDICAMENTO
    ItemEstoque(String nome, String descricao, double preco, CategoriaProduto categoria, Fabricante fabricante, Tarja tarja, List<ItemPrincipioAtivo> itemPrincipioAtivo, int quantidade) {
        this.produto = new Medicamento(nome, descricao, preco, categoria, fabricante, tarja, itemPrincipioAtivo);
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
