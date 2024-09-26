package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    // Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }
    // Exibe todos os contatos da agenda.
    public void exibirContatos() {
        if(!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        } else {
            throw new RuntimeException("Agenda vazia!");
        }
    }
    // Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> pesquisaSet = new HashSet<>();
        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if(c.getNome().startsWith(nome)) {
                    pesquisaSet.add(c);
                }
            }
            return pesquisaSet;
        } else {
            throw new RuntimeException("Agenda vazia!");
        }
    }
    // Atualiza o número de telefone de um contato específico.
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumeroTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;                
            }            
            }
            return contatoAtualizado;

        } else {
            throw new RuntimeException("Agenda vazia!");
        }

    }
    

    @Override
    public String toString() {
        return "AgendaContatos [contatoSet=" + contatoSet + "]";
    }
    public static void main(String[] args) {
        AgendaContatos agendaTeste = new AgendaContatos();
        //agendaTeste.exibirContatos();
        //agendaTeste.pesquisarPorNome("nome");
        agendaTeste.adicionarContato("nome 1", 4569082);
        agendaTeste.adicionarContato("nom 2", 4532282);
        agendaTeste.adicionarContato("nometo 3", 44682);
        agendaTeste.adicionarContato("name 4", 46482);
        agendaTeste.adicionarContato("name 5", 4782);
        agendaTeste.adicionarContato("nomety 6", 42343082);
        agendaTeste.adicionarContato("nomehh 7", 439082);
        agendaTeste.adicionarContato("nomeopl", 82);
        agendaTeste.exibirContatos();
        System.out.println(agendaTeste.pesquisarPorNome("name"));
        System.out.println(agendaTeste.atualizarNumeroContato("nome 1", 1111));
        agendaTeste.exibirContatos();



    
}





}


