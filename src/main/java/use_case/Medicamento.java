package use_case;

import java.util.List;

public class Medicamento extends Produto {
    private Tarja tarja;
    private List<ItemPrincipioAtivo> itemPrincipioAtivo;
    
    Medicamento(String nome, String descricao, double preco, CategoriaProduto categoria, Fabricante fabricante, Tarja tarja, List<ItemPrincipioAtivo> itemPrincipioAtivo){
        super(nome, descricao, preco, categoria, fabricante);
        this.tarja = tarja;
        this.itemPrincipioAtivo = itemPrincipioAtivo;
    }

    public Tarja getTarja() {
        return this.tarja;
    }

    public List<ItemPrincipioAtivo> getItemPrincipioAtivo() {
        return this.itemPrincipioAtivo;
    }

    public void setTarja(Tarja novaTarja){
        this.tarja = novaTarja;
    }
}
