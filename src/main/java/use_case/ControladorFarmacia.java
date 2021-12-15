package use_case;
import java.util.*;

public class ControladorFarmacia {
    private List<Produto> produtos;
    //private List<Funcionario> funcionarios;
    //private List<ItemEstoque> itensEstoque;
    private List<PrincipioAtivo> principiosAtivo;
    private List<Tarja> tarjas;
    private List<CategoriaProduto> categorias;
    private List<Fabricante> fabricantes;
    private List<Fornecedor> fornecedores;

    private javax.swing.JFrame view;

    public ControladorFarmacia(){
        this.produtos = new ArrayList<Produto>();
        //this.funcionarios = new ArrayList<Funcionario>();
        //this.itensEstoque = new ArrayList<ItemEstoque>();
        this.principiosAtivo = new ArrayList<PrincipioAtivo>();
        this.tarjas = new ArrayList<Tarja>();
        this.categorias = new ArrayList<CategoriaProduto>();
        this.fabricantes = new ArrayList<Fabricante>();
        this.fornecedores = new ArrayList<Fornecedor>();
        teste();
        this.view = new TelaInicial(this);
    }
    
    //Principio aberto-fechado. Se receber os dados terá mais tratamento do que receber produto
    public void cadastrarProduto(Produto produto){        
        this.produtos.add(produto);
        //System.out.println(this.produtos);
    }
    
    public List<Produto> getProdutos(){
        return this.produtos;
    }
    
    public void cadastrarCategoriaProduto(CategoriaProduto categoria){        
        this.categorias.add(categoria); 
        //System.out.println(this.produtos);
    }
    
    public List<CategoriaProduto> getCategoriasProduto(){
        //System.out.println(this.categorias.size());
        return this.categorias;
    }
    
    public void cadastrarTarja(Tarja tarja){        
        this.tarjas.add(tarja);
        //System.out.println(this.tarjas);
    }
    
    public List<Tarja> getTarjas(){
        return this.tarjas;
    }
    
    public void cadastrarFabricante(Fabricante fabricante){        
        this.fabricantes.add(fabricante);
        //System.out.println(this.produtos);
    }
    
    public List<Fabricante> getFabricantes(){
        return this.fabricantes;
    }
    
    public void cadastrarPrincipioAtivo(PrincipioAtivo principioAtivo){        
        this.principiosAtivo.add(principioAtivo);  
        //System.out.println(this.produtos);
    }
    
    public List<PrincipioAtivo> getPrincipiosAtivos(){
        return this.principiosAtivo;
    }
    
    public void cadastrarFornecedor(Fornecedor fornecedor){        
        this.fornecedores.add(fornecedor);  
        //System.out.println(this.fornecedores);
    }
    
    public List<Fornecedor> getFornecedores(){
        return this.fornecedores;
    }
    
    public void teste(){
    	CategoriaProduto categoria1 = new CategoriaProduto("Medicamentos", "Descrição de Categoria de Produto 1");        
        CategoriaProduto categoria2 = new CategoriaProduto("Higiene e Cuidados Pessoais", "Descrição de Categoria de Produto 2");
        CategoriaProduto categoria3 = new CategoriaProduto("Saúde e Bem-estar", "Descrição de Categoria de Produto 3");
        CategoriaProduto categoria4 = new CategoriaProduto("Beleza e Dermocosméticos", "Descrição de Categoria de Produto 4");
        CategoriaProduto categoria5 = new CategoriaProduto("Conveniência", "Descrição de Categoria de Produto 5");
        CategoriaProduto categoria6 = new CategoriaProduto("Mundo Infantil", "Descrição de Categoria de Produto 6");
        CategoriaProduto categoria7 = new CategoriaProduto("Outros", "Descrição de Categoria de Produto 7");
        
        this.cadastrarCategoriaProduto(categoria1);
        this.cadastrarCategoriaProduto(categoria2);
        this.cadastrarCategoriaProduto(categoria3);
        this.cadastrarCategoriaProduto(categoria4);
        this.cadastrarCategoriaProduto(categoria5);
        this.cadastrarCategoriaProduto(categoria6);
        this.cadastrarCategoriaProduto(categoria7);
        
        
        Fabricante fabricante1 = new Fabricante("Sanofi");
        Fabricante fabricante2 = new Fabricante("EMS");
        Fabricante fabricante3 = new Fabricante("Braida");
        this.cadastrarFabricante(fabricante1);
        this.cadastrarFabricante(fabricante2);
        this.cadastrarFabricante(fabricante3);

        Fornecedor fornecedor1 = new Fornecedor("Lucas", "(21)2222-3333", "lucas@ufrrj.br");
        Fornecedor fornecedor2 = new Fornecedor("Marcos", "(21)22222-3333", "marcos@ufrrj.br");

        fornecedor1.adicionarFabricante(fabricante1);
        fornecedor1.adicionarFabricante(fabricante2);
        fornecedor2.adicionarFabricante(fabricante3);
        this.cadastrarFornecedor(fornecedor1);
        this.cadastrarFornecedor(fornecedor2);
        
        Tarja tarja1 = new Tarja("Livre Comercialização", false);
        Tarja tarja2 = new Tarja("Tarja Vermelha sem retenção de receita", false);
        Tarja tarja3 = new Tarja("Tarja Vermelha com retenção de receita", true);
        Tarja tarja4 = new Tarja("Tarja Preta", true);
        this.cadastrarTarja(tarja1);
        this.cadastrarTarja(tarja2);
        this.cadastrarTarja(tarja3);
        this.cadastrarTarja(tarja4);
        
        
        PrincipioAtivo principioAtivo1 = new PrincipioAtivo("PrincipioAtivo 1");
        PrincipioAtivo principioAtivo2 = new PrincipioAtivo("PrincipioAtivo 2");
        PrincipioAtivo principioAtivo3 = new PrincipioAtivo("PrincipioAtivo 3");
        PrincipioAtivo principioAtivo4 = new PrincipioAtivo("PrincipioAtivo 4");
        this.cadastrarPrincipioAtivo(principioAtivo1);
        this.cadastrarPrincipioAtivo(principioAtivo2);
        this.cadastrarPrincipioAtivo(principioAtivo3);
        this.cadastrarPrincipioAtivo(principioAtivo4);
        
        List<ItemPrincipioAtivo> listaPrincipioAtivo1 = new ArrayList<ItemPrincipioAtivo>();
        listaPrincipioAtivo1.add(new ItemPrincipioAtivo(principioAtivo1, 100));
        listaPrincipioAtivo1.add(new ItemPrincipioAtivo(principioAtivo2, 200));

        Produto produto1 = new Produto("Shampoo", "Descrição do produto 1", 13.0, categoria2, fabricante3);  
        Produto produto2 = new Produto("Repelente", "Descrição do produto 2", 20.50, categoria3, fabricante3); 
        Produto produto3 = new Produto("Serum Vitamina C", "Descrição do produto 3", 120.99, categoria4, fabricante3); 
        Produto produto4 = new Produto("Fralda", "Descrição do produto 4", 20.58, categoria6, fabricante3); 
        Produto produto5 = new Produto("Adoçante", "Descrição do produto 5", 8.50, categoria5, fabricante3); 
        Medicamento med1 = new Medicamento("BraiDorflex", "Remédio para dor", 21.99, categoria1, fabricante1, tarja1, listaPrincipioAtivo1);;
        Medicamento med2 = new Medicamento("Ivermectina", "Remédio para piolho", 15.00, categoria1, fabricante2, tarja2, listaPrincipioAtivo1);
        Medicamento med3 = new Medicamento("Rivotril", "Remédio antidepressivo", 30.00, categoria1, fabricante3, tarja4, listaPrincipioAtivo1);
        Medicamento med4 = new Medicamento("Azitromicina", "Remédio 4", 30.00, categoria1, fabricante3, tarja3, listaPrincipioAtivo1);
        this.cadastrarProduto(produto1);
        this.cadastrarProduto(produto2);
        this.cadastrarProduto(produto3);
        this.cadastrarProduto(produto4);
        this.cadastrarProduto(produto5);
        produtos.add(med1);
        produtos.add(med2);
        produtos.add(med3);
        produtos.add(med4);
    }
    
    private Produto buscaProduto(String nomeProduto) {
        for(int i = 0; i < this.produtos.size(); i++)
        {
            if(this.produtos.get(i).getNome().equals(nomeProduto)) {
                return this.produtos.get(i);
            }
        }
        return null;
    }
    
    public void fazerVendaDinheiro(javax.swing.JTable tabelaProdutos, double valor) {
//        List<ItemVenda> itemVenda = new ArrayList<ItemVenda>();
        Venda venda = new Venda();
        
        for(int i = 0; i < tabelaProdutos.getRowCount(); i++) {
            venda.criarItemVenda(buscaProduto((String)tabelaProdutos.getValueAt(i,1)),(int)tabelaProdutos.getValueAt(i,3));
        }
        
        venda.realizarPagamento(new Dinheiro(valor, valor));
    }
    
    public void fazerVendaCartaoCredito(javax.swing.JTable tabelaProdutos, double valor, String numeroCartao, String validade, String nome, int parcelas) {
        Venda venda = new Venda();
        
        for(int i = 0; i < tabelaProdutos.getRowCount(); i++) {
            venda.criarItemVenda(buscaProduto((String)tabelaProdutos.getValueAt(i,1)),(int)tabelaProdutos.getValueAt(i,3));
        }

        venda.realizarPagamento(new CartaoCredito(valor, numeroCartao, parcelas, nome, validade));
    }
    
    public void fazerVendaCartaoDebito(javax.swing.JTable tabelaProdutos, double valor, String numeroCartao, String validade, String nome) {
        Venda venda = new Venda();
        
        for(int i = 0; i < tabelaProdutos.getRowCount(); i++) {
            venda.criarItemVenda(buscaProduto((String)tabelaProdutos.getValueAt(i,1)),(int)tabelaProdutos.getValueAt(i,3));
        }

        venda.realizarPagamento(new CartaoDebito(valor, numeroCartao, nome, validade));
    }
    
    public void iniciarTelaInicial() {
        javax.swing.JFrame viewAntiga = view;
        viewAntiga.dispose();
        view = new TelaInicial(this);
        this.run();
        
    }

    public void iniciarTelaVenda() {
        javax.swing.JFrame viewAntiga = view;
        view = new TelaVenda(this);
        this.run();
        viewAntiga.dispose();
        //...
    }

    public void iniciarTelaFazerPagamento() {
        javax.swing.JFrame viewAntiga = view;
        viewAntiga.setVisible(false);
        view = new TelaFazerPagamento((TelaVenda)viewAntiga, this);
        this.run();
        view.setAlwaysOnTop(true);
        //viewAntiga.dispose();
    }

    public void iniciarTelaCadastrarProduto() {
        //...
        javax.swing.JFrame viewAntiga = view;
        view = new TelaCadastrarProduto(this);
        this.run();
        viewAntiga.dispose();
    }

    public void iniciarTelaFazerPedido() {
        //...
        javax.swing.JFrame viewAntiga = view;
        view = new TelaFazerPedido(this);
        this.run();
        viewAntiga.dispose();
    }

    public void iniciarTelaEstoque() {
        javax.swing.JFrame viewAntiga = view;
        view = new TelaEstoque(this);
        this.run();
        viewAntiga.dispose();
        //...
    }

    public void setView(javax.swing.JFrame view) {
        this.view = view;
    }

    public void run(){
        view.setSize(1280,751);
        view.setVisible(true);
        // TelaInicial.iniciar_tela(this);
    }
}
