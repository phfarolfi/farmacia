package use_case;

public class CartaoDebito extends Pagamento{
    private String cartao;
    private String nome;
    private String validade;

    CartaoDebito(double valor, String cartao, String nome, String validade) {
        this.valor = valor;
        this.cartao = cartao;
        this.nome = nome;
        this.validade = validade;
    }

    // public String getCartao() {
    //     return this.cartao;
    // }
}