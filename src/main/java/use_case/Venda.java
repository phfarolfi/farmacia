package use_case;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Venda {
    private Date data;
    private boolean estaCompleta;
    private Pagamento pagamento;
    private List<ItemVenda> itemVenda;
    //    private List<Receita> receita;
    //    private Funcionario funcionario;

    public Venda() {
        this.data = new Date();
        this.estaCompleta = false;
        this.itemVenda = new ArrayList<ItemVenda>();
        // this.receita = new ArrayList<Receita>();   
        // this.funcionario = funcionario;
    }
    
    public List<ItemVenda> getItemVenda() {
        return this.itemVenda;
    }

    public void setEstaCompleta(boolean estaCompleta) {
        this.estaCompleta = estaCompleta;
    }

    public void criarItemVenda(Produto produto, int quantidade) {
        this.itemVenda.add(new ItemVenda(produto, quantidade));
    }

    public void excluirItemVenda(Produto produto) {
        for(int i = 0; i < this.itemVenda.size(); i++) {
            if(produto.getCodigo() == this.itemVenda.get(i).getProduto().getCodigo()) {
                this.itemVenda.remove(this.itemVenda.get(i));
            }
        }
    }

    public boolean verificarTarja(ItemVenda itemVenda) {

        if(itemVenda.getProduto() instanceof Medicamento){
            if(((Medicamento)itemVenda.getProduto()).getTarja().getPrecisaReceita()) {
                return true;
            }
        }
        return false;
    }
    
//    public void registrarReceita(String foto) {
//        this.receita.add(new Receita(foto));
//    }

    public boolean validarVenda() {
        if(this.itemVenda.size() > 0)
            return true;
        return false;
    }

    public void finalizarVenda() {
        if(this.validarVenda()){
            this.estaCompleta = true;
        }
        //ainda tem que diminuir o número do produto no estoque

    }

    public double valorTotal() {
        double valor = 0;
        for(int i = 0 ; i < this.itemVenda.size(); i++){
                valor += this.itemVenda.get(i).calculoVenda();
        }
        return valor;
    }

    public double valorPago(Pagamento pagamento) {
        double valor = 0;
//        for(int i = 0 ; i < pagamentos.size(); i++){
//                valor += pagamentos.get(i).getValor();
//        }
        return pagamento.getValor();
    }

    public void realizarPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void emitirNotaFiscal() {
        for(int i = 0 ; i < itemVenda.size(); i++){
            System.out.println("Foi pago. =)");
        }
    }
}
