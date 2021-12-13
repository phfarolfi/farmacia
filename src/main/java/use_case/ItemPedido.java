package use_case;

public class ItemPedido {
    private int quantidadePedida;
    private int quantidadeRecebida;
    private Produto produto;

    ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidadePedida = quantidade;
    }
    
    public void registrarQuantidadeRecebida(int quantidade) {
        this.quantidadeRecebida = quantidade;
    }

    public Produto getProduto(){
        return this.produto;
    }
}
