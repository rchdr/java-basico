package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciadorSet;
    public GerenciadorAlunos() {
        this.gerenciadorSet = new HashSet<>();
    }
    // Adiciona um aluno ao conjunto.
    public void adicionarAluno(String nome, Long matricula, double media) {
        gerenciadorSet.add(new Aluno(nome, matricula, media));
    }
    // Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if(!gerenciadorSet.isEmpty()) {
            for (Aluno a : gerenciadorSet) {
                if(a.getMatricula() == matricula) {
                    alunoParaRemover = a;                    
                    break;

                }
            }
            gerenciadorSet.remove(alunoParaRemover);
        } else {
            System.out.println("Não há alunos cadastrados");
        }
        if (alunoParaRemover == null && !gerenciadorSet.isEmpty()) {
            System.out.println("Matricula não encontrada!");
        }
    }
    // Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(gerenciadorSet);
        if(!gerenciadorSet.isEmpty()) {
            return alunoPorNome;
        } else {
            throw new RuntimeException("Cadastro vazio!");
        }

    }
    // Exibe todos os alunos do conjunto em ordem crescente de nota.
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorAlunosPorNota());
        if(!gerenciadorSet.isEmpty()) {
            alunoPorNota.addAll(gerenciadorSet);
            return alunoPorNota;
        } else {
            throw new RuntimeException("Cadastro vazio!");
        }

    }
    // Exibe todos os alunos do conjunto.
    public void exibirAlunos() {
        System.out.println(gerenciadorSet);
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorTeste = new GerenciadorAlunos();
        //gerenciadorTeste.exibirAlunos();
        //gerenciadorTeste.exibirAlunosPorNome();
        //gerenciadorTeste.exibirAlunosPorNota();
        gerenciadorTeste.adicionarAluno("nome 1", 1L, 5.4);
        gerenciadorTeste.adicionarAluno("nome 2", 1L, 7.4);
        gerenciadorTeste.adicionarAluno("nome 3", 3L, 8.4);
        gerenciadorTeste.adicionarAluno("nome 4", 4L, 0.4);
        gerenciadorTeste.adicionarAluno("nome 5", 5L, 9.4);
        gerenciadorTeste.exibirAlunos();
        System.out.println(gerenciadorTeste.exibirAlunosPorNome());
        System.out.println(gerenciadorTeste.exibirAlunosPorNota());
        gerenciadorTeste.removerAluno(7L);
        gerenciadorTeste.removerAluno(3L);
        gerenciadorTeste.exibirAlunos();
    
}
}
