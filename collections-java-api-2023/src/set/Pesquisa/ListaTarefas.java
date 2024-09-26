package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }
    // Adiciona uma nova tarefa ao Set.
    public void adicionarTarefa(String descricao) {
        this.tarefasSet.add(new Tarefa(descricao));
    }
    // Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!tarefasSet.isEmpty()) {
            for(Tarefa t : tarefasSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }                      
        } else {
            System.out.println("Lista vazia");
        }
        tarefasSet.remove(tarefaParaRemover);
        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
          }

    }
    // Exibe todas as tarefas da lista de tarefas.
    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }
    // Conta o número total de tarefas na lista de tarefas.
    public int contarTarefas() {
        return tarefasSet.size();
    }
    // Retorna um Set com as tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefaConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for(Tarefa t : tarefasSet) {
                if(t.getConcluida()) {
                    tarefaConcluidas.add(t);
                }
            }
        } else {
            throw new RuntimeException("Lista de tarefas vazia!");
        }
        return tarefaConcluidas;
    }
    // Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for(Tarefa t : tarefasSet) {
                if(!t.getConcluida()) {
                    tarefaPendentes.add(t);
                }
            }
        } else {
            throw new RuntimeException("Lista de tarefas vazia!");
        }
        return tarefaPendentes;
    }
    // Marca uma tarefa como concluída de acordo com a descrição.
    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaParaMarcar = null;
        if(!tarefasSet.isEmpty()) {
            for(Tarefa t : tarefasSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    tarefaParaMarcar = t;
                    break;
                }
            }
        } else {
            System.out.println("Lista vazia!");
        }
        if(tarefaParaMarcar == null && !tarefasSet.isEmpty()) {
            System.out.println("Tarefa não encontrada!");
        }
    }
    // Marca uma tarefa como pendente de acordo com a descrição.
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcar = null;
        if(!tarefasSet.isEmpty()) {
            for(Tarefa t : tarefasSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                    tarefaParaMarcar = t;
                    break;
                }
            }
        } else {
            System.out.println("Lista vazia!");
        }
        if(tarefaParaMarcar == null && !tarefasSet.isEmpty()) {
            System.out.println("Tarefa não encontrada!");
        }
    }
    // Remove todas as tarefas da lista de tarefas.
    public void limparListaTarefas() {
        tarefasSet.removeAll(tarefasSet);
    }
    public static void main(String[] args) {
        ListaTarefas tarefasTeste = new ListaTarefas();
        System.out.println(tarefasTeste.contarTarefas());
        tarefasTeste.marcarTarefaConcluida("arruamar");
        tarefasTeste.marcarTarefaPendente("arrumar");
        tarefasTeste.exibirTarefas();
        tarefasTeste.adicionarTarefa("arrumar");
        tarefasTeste.adicionarTarefa("lavar");
        tarefasTeste.adicionarTarefa("academia");
        tarefasTeste.adicionarTarefa("limpar");
        tarefasTeste.adicionarTarefa("estudar");
        System.out.println(tarefasTeste.obterTarefasPendentes());
        System.out.println(tarefasTeste.obterTarefasConcluidas());
        tarefasTeste.marcarTarefaConcluida("limpar");
        System.out.println(tarefasTeste.obterTarefasConcluidas());
        System.out.println(tarefasTeste.obterTarefasPendentes());
        tarefasTeste.limparListaTarefas();
        tarefasTeste.exibirTarefas();

    }
}
