package set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> cadastroSet;

    public CadastroProdutos() {
        this.cadastroSet = new HashSet<>();
    }
    // Adiciona um produto ao cadastro.
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        cadastroSet.add(new Produto(cod, nome, preco, quantidade));
    } 
    // Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(cadastroSet);
            if(!cadastroSet.isEmpty()) {
                return produtosPorNome;
            } else {
                throw new RuntimeException("Cadastro vazio!");
            }
    } 
    // Exibe todos os produtos do cadastro em ordem crescente de preço.
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!cadastroSet.isEmpty()) {
            produtosPorPreco.addAll(cadastroSet);
            return produtosPorPreco;
          } else {
            throw new RuntimeException("Cadastro vazio!");
          }

    }
    public static void main(String[] args) {
        CadastroProdutos cadastroTeste = new CadastroProdutos();
        //cadastroTeste.exibirProdutosPorNome();
        //cadastroTeste.exibirProdutosPorPreco();
        cadastroTeste.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroTeste.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroTeste.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroTeste.adicionarProduto(4L, "Teclado", 50d, 15);
        System.out.println(cadastroTeste.cadastroSet);
        System.out.println(cadastroTeste.exibirProdutosPorNome());
        System.out.println(cadastroTeste.exibirProdutosPorPreco());
    } 

    
}
