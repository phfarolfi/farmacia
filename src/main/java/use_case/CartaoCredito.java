package use_case;

public class CartaoCredito extends Pagamento{
    private String cartao;
    private int parcelas;

    CartaoCredito(double valor, String cartao, int parcelas) {
        this.valor = valor;
        this.cartao = cartao;
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return this.parcelas;
    }

    // public String getCartao() {
    //     return this.cartao;
    // }

}