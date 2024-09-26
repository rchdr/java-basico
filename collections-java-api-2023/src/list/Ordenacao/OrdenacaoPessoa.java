package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    
  private List<Pessoa> ordenaPessoa;

    public OrdenacaoPessoa() {
        this.ordenaPessoa = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        ordenaPessoa.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(ordenaPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(ordenaPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordem = new OrdenacaoPessoa();
        ordem.adicionarPessoa("Nome 1", 20, 1.56);
        ordem.adicionarPessoa("Nome 2", 30, 1.80);
        ordem.adicionarPessoa("Nome 3", 25, 1.70);
        ordem.adicionarPessoa("Nome 4", 19, 1.56);
        System.out.println(ordem.ordernarPorIdade());
        System.out.println(ordem.ordenarPorAltura());
    }



}
