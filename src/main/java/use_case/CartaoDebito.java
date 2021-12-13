package use_case;

public class CartaoDebito extends Pagamento{
    private String cartao;

    CartaoDebito(double valor, String cartao) {
        this.valor = valor;
        this.cartao = cartao;
    }

    // public String getCartao() {
    //     return this.cartao;
    // }
}