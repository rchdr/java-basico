package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }
    
    //  Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }
    // Exibe todos os produtos, suas quantidades em estoque e preços.
    public void exibirProdutos() {
        if (!estoqueMap.isEmpty()) {
            System.out.println(estoqueMap);
        } else {
            System.out.println("Estoque vazio!");
        }

    } 
    // Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }        
    }

    // Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public Produto obterProdutoMaisCaro() {
        Produto maisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()) {
            for(Produto p : estoqueMap.values()) {
                if(p.getPreco() > precoMaisCaro) {
                    maisCaro = p;
                    precoMaisCaro = p.getPreco();
                }
            }
            return maisCaro;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }

    }
    // Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
    public Produto obterProdutoMaisBarato() {
        Produto maisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;
        if(!estoqueMap.isEmpty()) {
            for(Produto p : estoqueMap.values()) {
                if(p.getPreco() < precoMaisBarato) {
                    maisBarato = p;
                    precoMaisBarato = p.getPreco();
                }
            }
            return maisBarato;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }
    }
    //  Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaisValor = null;
        double maiorValor = 0d;
        if(!estoqueMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueMap.entrySet()) {
                double valorProduto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                    if(valorProduto > maiorValor) {
                        maiorValor = valorProduto;
                        produtoMaisValor = entry.getValue();
                    }  
            }
            return produtoMaisValor;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }

    }
    public static void main(String[] args) {
        EstoqueProdutos estoqueTeste = new EstoqueProdutos();
        estoqueTeste.exibirProdutos();
        //estoqueTeste.calcularValorTotalEstoque();
        //estoqueTeste.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        //estoqueTeste.obterProdutoMaisBarato();
        //estoqueTeste.obterProdutoMaisCaro();
        // Adiciona produtos ao estoque
    estoqueTeste.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoqueTeste.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoqueTeste.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoqueTeste.adicionarProduto(4L, "Teclado", 2, 40.0);

    // Exibe os produtos no estoque
    estoqueTeste.exibirProdutos();

    // Calcula e exibe o valor total do estoque
    System.out.println("Valor total do estoque: R$" + estoqueTeste.calcularValorTotalEstoque());

    // Obtém e exibe o produto mais caro
    Produto produtoMaisCaro = estoqueTeste.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    // Obtém e exibe o produto mais barato
    Produto produtoMaisBarato = estoqueTeste.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    // Obtém e exibe o produto com a maior quantidade em valor no estoque
    Produto produtoMaiorQuantidadeValorTotal = estoqueTeste.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }

}
