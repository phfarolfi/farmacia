package use_case;

public class Produto {
    private String nome;
    private String descricao;
    private int codigo;
    private double preco;
    private CategoriaProduto categoria;
    private Fabricante fabricante;

    private static int cod = 1;

    Produto(String nome, String descricao, double preco, CategoriaProduto categoria, Fabricante fabricante){
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = cod++;
        this.preco = preco;
        this.categoria = categoria;
        this.fabricante = fabricante;
        fabricante.adicionarProduto(this);
    }

    public void setCategoria(CategoriaProduto novaCategoria){
        this.categoria = novaCategoria;
    }

    public CategoriaProduto getCategoria() {
        return this.categoria;
    }

    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }
}
