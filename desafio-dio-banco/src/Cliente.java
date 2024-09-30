import java.time.LocalDate;

public class Cliente {
    private String nome;
    private int cpf;
    private LocalDate dataNascimento;

    public Cliente(int cpf, LocalDate dataNascimento, String nome) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[NOME: " + nome + ", CPF: " + cpf + ", DATA DE NASCIMENTO: " + dataNascimento + "] ";
    }
    


}
