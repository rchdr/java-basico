package set.Pesquisa;

public class Contato {
    private String nome;
    private int numeroTelefone;
    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroTelefone() {
        return numeroTelefone;
    }
    

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contato{");
        sb.append("nome=").append(nome);
        sb.append(", numeroTelefone=").append(numeroTelefone);
        sb.append('}');
        return sb.toString();
    }
}
