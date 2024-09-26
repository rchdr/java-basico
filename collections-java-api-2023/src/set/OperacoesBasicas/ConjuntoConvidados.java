package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String convidado, int codigoConvite) {
        convidadoSet.add(new Convidado(convidado, codigoConvite));
    }
    public void removerConvidadoPorCodigoDoConvite(int codigo) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if (c.getCodigoDoConvite() == codigo) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoTeste = new ConjuntoConvidados();
        conjuntoTeste.adicionarConvidado("c1", 2);
        conjuntoTeste.adicionarConvidado("c1", 123);
        conjuntoTeste.adicionarConvidado("c2", 11);
        conjuntoTeste.adicionarConvidado("c3", 2342);
        conjuntoTeste.adicionarConvidado("c4", 342);
        conjuntoTeste.adicionarConvidado("c5", 8);
        conjuntoTeste.adicionarConvidado("c6", 8);
        System.out.println(conjuntoTeste.contarConvidados());
        conjuntoTeste.removerConvidadoPorCodigoDoConvite(2);
        conjuntoTeste.removerConvidadoPorCodigoDoConvite(11);
        System.out.println(conjuntoTeste.contarConvidados());
        conjuntoTeste.exibirConvidados();
        
    }


}
