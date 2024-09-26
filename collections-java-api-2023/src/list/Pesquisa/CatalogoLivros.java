package list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoList;
    public CatalogoLivros() {
        this.catalogoList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogoList.add(new Livro(autor, titulo, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int ano1, int ano2) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (l.getAnoPublicacao() >= ano1 && l.getAnoPublicacao() <= ano2) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
       CatalogoLivros novoCatalogo = new CatalogoLivros();
       novoCatalogo.adicionarLivro("Livro 1", "Autor 1", 2020); 
       novoCatalogo.adicionarLivro("Livro 1", "Autor 2", 2025); 
       novoCatalogo.adicionarLivro("Livro 3", "Autor 2", 2001); 
       novoCatalogo.adicionarLivro("Livro 4", "Autor 4", 1979); 
       novoCatalogo.adicionarLivro("Livro 5", "Autor 5", 2023);
       System.out.println(novoCatalogo.pesquisarPorAutor("autor 2")); 
       System.out.println(novoCatalogo.pesquisarPorIntervaloAnos(1950, 2001));
       System.out.println(novoCatalogo.pesquisarPorTitulo("livro 1")); 
    }

}
