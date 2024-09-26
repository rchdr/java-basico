package set.Ordenacao;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;  
    private long cod;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public long getCod() {
        return cod;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("Nome: ").append(nome);
        sb.append(", Código = ").append(cod);
        sb.append(", Preço = ").append(preco);
        sb.append(", Quantidade = ").append(quantidade);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public int compareTo(Produto p) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (this.cod ^ (this.cod >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.cod == other.cod;
    }


}
class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
