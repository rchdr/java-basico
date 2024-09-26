package set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codigoDoConvite;
    
    public Convidado (String nome, int codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }
    

    public String getNome() {
        return nome;
    }

    public int getCodigoDoConvite() {
        return codigoDoConvite;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoDoConvite=" + codigoDoConvite + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigoDoConvite;
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
        final Convidado other = (Convidado) obj;
        return this.codigoDoConvite == other.codigoDoConvite;
    }
    
}
