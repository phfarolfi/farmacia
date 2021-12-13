package use_case;

public class Dinheiro extends Pagamento{
    private double valorRecebido;

    Dinheiro(double valor, double valorRecebido) {
        this.valor = valor;
        this.valorRecebido = valorRecebido;
    }

    public double getValorRecebido() {
        return this.valorRecebido;
    } 

    public double troco(){
        return this.getValorRecebido() - this.getValor();
    }
    
}
