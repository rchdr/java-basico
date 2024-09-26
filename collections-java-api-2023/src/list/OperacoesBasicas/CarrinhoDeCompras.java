package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    private List<Item> itemList;
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            System.out.println("Ites removidos: " + itemParaRemover);
            itemList.removeAll(itemParaRemover);            
        } else {
            System.out.println("Nenhum item no carrinho!");
        }
        }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco()*i.getQuantidade();
                valorTotal  += valorItem;
            }
            return valorTotal;            
        } else {
            throw new RuntimeException("Nenhum item no carrinho!");
        }
    }
    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("Nenhum item no carrinho!");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + itemList +
            '}';
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho0 = new CarrinhoDeCompras();
        carrinho0.exibirItens();
        carrinho0.calcularValorTotal();
        carrinho0.adicionarItem("Lápis", 2d, 3);
        carrinho0.adicionarItem("Lápis", 2d, 3);
        carrinho0.adicionarItem("Caderno", 35d, 1);
        carrinho0.adicionarItem("Borracha", 2d, 2);
        carrinho0.exibirItens();
        carrinho0.removerItem("lápis");
        carrinho0.exibirItens();
        System.out.println ("O valor total é " + carrinho0.calcularValorTotal());

    }
    

}
