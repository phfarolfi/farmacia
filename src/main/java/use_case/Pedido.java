package use_case;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido{
    private Date dataFeito;
    private boolean pedidoFeito;
    private Date dataEntregue;
    private boolean pedidoEntregue;
    private List<ItemPedido> itemPedido;
    private Fornecedor fornecedor;
    
    Pedido(Fornecedor fornecedor) {
        this.dataFeito = new Date();
        this.pedidoFeito = false;
        this.pedidoEntregue = false;
        this.itemPedido = new ArrayList<ItemPedido>();
        this.fornecedor = fornecedor;
    }

    public Date getDataFeito() {
        return this.dataFeito;
    }

    public boolean getPedidoFeito() {
        return this.pedidoFeito;
    }

    public Date getDataEntregue() {
        return this.dataEntregue;
    }

    public boolean getPedidoEntregue() {
        return this.pedidoEntregue;
    }

    public List<ItemPedido> getItemPedido() {
        return this.itemPedido;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void criarItemPedido(Produto produto, int quantidade){
        this.itemPedido.add(new ItemPedido(produto, quantidade));
    }

    public void retirarItemPedido(Produto produto){
        for(int i = 0; i < this.itemPedido.size(); i++) {
            if(produto.getCodigo() == this.itemPedido.get(i).getProduto().getCodigo()) {
                this.itemPedido.remove(this.itemPedido.get(i));
            }
        }
    }

    public boolean validarPedido(){
        if(this.itemPedido.size() > 0)
            return true;
        return false;
    }

    public void finalizarPedidoFeito(){
        if(this.validarPedido()){
            this.pedidoFeito = true;
        }
    }

    public void finalizarPedidoEntregue(){
        this.pedidoEntregue = true;
        this.dataEntregue = new Date();
        //ainda tem que aumentar o número do produto no estoque
    }
}
