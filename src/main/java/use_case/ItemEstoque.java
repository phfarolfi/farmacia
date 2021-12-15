package use_case;

import java.util.List;

public class ItemEstoque {
    private Produto produto;
    private int quantidade;

    // PRODUTO
    public ItemEstoque(Produto produto, int quantidade) {
        this.produto = produto;
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
