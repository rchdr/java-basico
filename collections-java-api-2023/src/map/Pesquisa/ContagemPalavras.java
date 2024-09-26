package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }
    // Adiciona uma palavra à contagem.
    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }
    // Remove uma palavra da contagem, se estiver presente.
    public void removerPalavra(String palavra) {
        if(!contagemMap.isEmpty()) {
            contagemMap.remove(palavra);
        } else {
            System.out.println("Contagem vazia!");
        }

    }
    // Exibe todas as palavras e suas respectivas contagens.
    public void exibirContagemPalavras() {
        if(!contagemMap.isEmpty()) {
            System.out.println(contagemMap);
        } else {
            System.out.println("Contagem vazia!");
        }
    }
    // Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer valorDaMaisFrequente = Integer.MIN_VALUE;
        if(!contagemMap.isEmpty()) {
            for(Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
                if(entry.getValue() > valorDaMaisFrequente) {
                    valorDaMaisFrequente = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
            return palavraMaisFrequente + " é o que mais aparece, " + valorDaMaisFrequente + " vezes.";
        } else {
            throw new RuntimeException("Contagem vazia!");
        }
    }
    public static void main(String[] args) {
        ContagemPalavras contagemTeste = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemTeste.adicionarPalavra("Java", 2);
        contagemTeste.adicionarPalavra("Python", 8);
        contagemTeste.adicionarPalavra("JavaScript", 1);
        contagemTeste.adicionarPalavra("C#", 6);
    
        // Exibe as linguagens e suas contagens
        contagemTeste.exibirContagemPalavras();
    
        // Encontra e exibe a linguagem mais frequente
        System.out.println(contagemTeste.encontrarPalavraMaisFrequente());
        
    }



}
