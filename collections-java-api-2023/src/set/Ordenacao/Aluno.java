package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double media;
    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public Long getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Nome: ").append(nome);
        sb.append(", Matrícula = ").append(matricula);
        sb.append(", Média = ").append(media);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public int compareTo(Aluno a) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
    

}
class ComparatorAlunosPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        // TODO Auto-generated method stub
        return Double.compare(a1.getMedia(), a2.getMedia());
    }

}