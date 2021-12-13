package use_case;

public class Farmaceutico extends Funcionario{
    private String crf;

    Farmaceutico(String nome, String endereco, String telefone, String crf) {
        super(nome, endereco, telefone);
        this.crf = crf;
    }

    public String getCRF() {
        return this.crf;
    }    
}
