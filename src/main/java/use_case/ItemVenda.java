package use_case;

public class ItemVenda {
    private int quantidade;
    private double precoVenda;
    private Produto produto;

    ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoVenda = produto.getPreco();
    }
    
    public double calculoVenda() {
        return this.quantidade * this.precoVenda;
    }

    public Produto getProduto() {
        return this.produto;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
}
