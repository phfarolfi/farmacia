package use_case;
import java.util.*;

public class ControladorFarmacia {
    private List<Produto> estoque;
    private List<Funcionario> funcionarios;
    private List<ItemEstoque> itensEstoque;
    private List<PrincipioAtivo> principiosAtivo;
    private List<Tarja> tarjas;
    private List<CategoriaProduto> categorias;
    private List<Fabricante> fabricantes;
    
    ControladorFarmacia(){
        this.estoque = new ArrayList<Produto>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.itensEstoque = new ArrayList<ItemEstoque>();
        this.principiosAtivo = new ArrayList<PrincipioAtivo>();
        this.tarjas = new ArrayList<Tarja>();
        this.categorias = new ArrayList<CategoriaProduto>();
        this.fabricantes = new ArrayList<Fabricante>();
    }
    
    //Principio aberto-fechado. Se receber os dados terá mais tratamento do que receber produto
    public void cadastrarProduto(Produto produto){        
        this.estoque.add(produto);
        
        System.out.println(this.estoque);
    }
    
    public List<Produto> getEstoque(){
        return this.estoque;
    }
    
    public void cadastrarCategoriaProduto(CategoriaProduto categoria){        
        this.categorias.add(categoria);
        
        //System.out.println(this.estoque);
    }
    
    public List<CategoriaProduto> getCategoriasProduto(){
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
        
        //System.out.println(this.estoque);
    }
    
    public List<Fabricante> getFrabricantes(){
        return this.fabricantes;
    }
    
    public void cadastrarPrincipioAtivo(PrincipioAtivo principioAtivo){        
        this.principiosAtivo.add(principioAtivo);
        
        //System.out.println(this.estoque);
    }
    
    public List<PrincipioAtivo> getPrincipiosAtivos(){
        return this.principiosAtivo;
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
        
        
        Produto produto1 = new Produto("Shampoo", "Descrição do produto 1", 13.0, categoria2, fabricante3);  
        Produto produto2 = new Produto("Repelente", "Descrição do produto 2", 20.50, categoria3, fabricante3); 
        Produto produto3 = new Produto("Serum Vitamina C", "Descrição do produto 3", 120.99, categoria4, fabricante3); 
        Produto produto4 = new Produto("Fralda", "Descrição do produto 4", 20.58, categoria6, fabricante3); 
        Produto produto5 = new Produto("Adoçante", "Descrição do produto 5", 8.50, categoria5, fabricante3); 
//        med1 = new Medicamento("BraiDorflex", "Remédio para dor", 21.99, categoria1, fabricante1, "Analgésico", tarja1, listaPrincipioAtivo1);;
//        med2 = new Medicamento("Ivermectina", "Remédio para piolho", 15.00, categoria1, fabricante2, "Tipo 2", tarja2, listaPrincipioAtivo1);
//        med3 = new Medicamento("Rivotril", "Remédio antidepressivo", 30.00, categoria1, fabricante3, "Antidepressivo", tarja4, listaPrincipioAtivo2);
//        med4 = new Medicamento("Azitromicina", "Remédio 4", 30.00, categoria1, fabricante3, "Tipo 3", tarja3, listaPrincipioAtivo2);
        this.cadastrarProduto(produto1);
        this.cadastrarProduto(produto2);
        this.cadastrarProduto(produto3);
        this.cadastrarProduto(produto4);
        this.cadastrarProduto(produto5);
//        produtos.add(med1);
//        produtos.add(med2);
//        produtos.add(med3);
//        produtos.add(med4);
    }
    
    public void run(){
        this.teste();        
             
        TelaInicial.iniciar_tela(this);
    }
    
    public static void main(String args[]){
        ControladorFarmacia farmacia = new ControladorFarmacia();
        farmacia.run();
    }
}
