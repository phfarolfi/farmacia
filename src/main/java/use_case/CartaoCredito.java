package use_case;

public class CartaoCredito extends Pagamento{
    private String cartao;
    private int parcelas;
    private String nome;
    private String validade;

    public CartaoCredito(double valor, String cartao, int parcelas, String nome, String validade) {
        this.valor = valor;
        this.cartao = cartao;
        this.parcelas = parcelas;
        this.nome = nome;
        this.validade = validade;
    }

    public int getParcelas() {
        return this.parcelas;
    }

    // public String getCartao() {
    //     return this.cartao;
    // }

}