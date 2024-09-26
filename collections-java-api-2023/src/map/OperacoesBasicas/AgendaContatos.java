package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;
    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer numero) {
        agendaMap.put(nome, numero);
    }
    public void removerContato(String nome) {
        if(!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        } else {
            System.out.println("Agenda vazia!");
        }
    }
    public void exibirContatos() {
        if(!agendaMap.isEmpty()) {
            System.out.println(agendaMap);
        } else {
            System.out.println("Agenda vazia!");
        }
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaMap.isEmpty()) {
            numeroPorNome = agendaMap.get(nome);
            if(numeroPorNome == null) {
                System.out.println("Contato não encontrado!");
            }            
        } else {
            System.out.println("Agenda vazia!");
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
    AgendaContatos agendaTeste = new AgendaContatos();
    agendaTeste.exibirContatos();
    agendaTeste.adicionarContato("Camila", 123456);
    agendaTeste.adicionarContato("João", 5665);
    agendaTeste.adicionarContato("Carlos", 1111111);
    agendaTeste.adicionarContato("Ana", 654987);
    agendaTeste.adicionarContato("Maria", 1111111);
    agendaTeste.adicionarContato("Camila", 44444);
    agendaTeste.exibirContatos();
    agendaTeste.removerContato("Maria");
    agendaTeste.exibirContatos();
    String nomePesquisa = "João";
    Integer numeroPesquisa = agendaTeste.pesquisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaTeste.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);

    }
}

