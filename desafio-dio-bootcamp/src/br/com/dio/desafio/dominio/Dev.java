package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.setDevsInscritos(this);
    }
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.err.println("Não há conteúdo matriculado!");
        }
    }
    public double calcularTotalXP() {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    @Override
    public String toString() {
        return "Dev [Nome: " + nome + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosIncritos == null) ? 0 : conteudosIncritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosIncritos == null) {
            if (other.conteudosIncritos != null)
                return false;
        } else if (!conteudosIncritos.equals(other.conteudosIncritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }
    

}
