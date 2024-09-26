package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }
    //Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra) {
        this.palavrasSet.add(palavra);
    }
    //Remove uma palavra do conjunto.
    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for(String p : palavrasSet) {
            if(p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }
    //Verifica se uma palavra está presente no conjunto.
    public boolean  verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }
    //Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConjuntoPalavrasUnicas{");
        sb.append("palavrasSet=").append(palavrasSet);
        sb.append('}');
        return sb.toString();
    }
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasTest = new ConjuntoPalavrasUnicas();
        palavrasTest.adicionarPalavra("oi");
        palavrasTest.adicionarPalavra("oi");
        palavrasTest.adicionarPalavra("jeowe");
        palavrasTest.adicionarPalavra("nunca");
        palavrasTest.exibirPalavrasUnicas();
        palavrasTest.removerPalavra("nunca");
        System.out.println(palavrasTest.verificarPalavra("oi"));
        palavrasTest.exibirPalavrasUnicas();

    }
    
    
}
