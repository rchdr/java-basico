package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    // Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }
    //Remove uma palavra do dicionário, dado o termo a ser removido.
    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionário vazio!");
        }

    }
    // Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    public void exibirPalavras() {
        if(!dicionarioMap.isEmpty()) {
        System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário vazio!");
        }
    }
    // Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    public String pesquisarPorPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            String definicaoPesquisada = dicionarioMap.get(palavra);
            if(definicaoPesquisada != null) {
                return definicaoPesquisada;
            }
            return "Palavra não encontrada!";     
        } else {
            return "Dicionário vazio!";
        }
    }
    public static void main(String[] args) {
        Dicionario dicionarioTeste = new Dicionario();
        dicionarioTeste.exibirPalavras();
        System.out.println(dicionarioTeste.pesquisarPorPalavra("palavra"));
        dicionarioTeste.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionarioTeste.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionarioTeste.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionarioTeste.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionarioTeste.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionarioTeste.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionarioTeste.removerPalavra("typescript");
        dicionarioTeste.exibirPalavras();
    }


}
