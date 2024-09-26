package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap =  new HashMap<>();
    }    
    // Adiciona um evento à agenda.
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaMap.put(data, new Evento(nome, atracao));
    }
    // Exibe a agenda de eventos em ordem crescente de data.
    public Map<LocalDate, Evento> exibirAgenda() {
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaMap);
        return agendaTreeMap;
    }
    // Retorna o próximo evento que ocorrerá.
    public Evento obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaMap);
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : agendaTreeMap.entrySet()) {
         if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            proximoEvento = entry.getValue();
            break;
         }   
        }
        return proximoEvento;
    }
    public static void main(String[] args) {
        AgendaEventos agendaTeste  = new AgendaEventos();
        // Adiciona eventos à agenda
        agendaTeste.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaTeste.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaTeste.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaTeste.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaTeste.adicionarEvento(LocalDate.of(2025, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        System.out.println(agendaTeste.exibirAgenda());

        // Obtém e exibe o próximo evento na agenda
        System.out.println(agendaTeste.obterProximoEvento());

    }

    
}
