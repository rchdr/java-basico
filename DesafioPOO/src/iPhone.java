public class iPhone implements Navegador, AparelhoTelefonico, ReprodutorMusica{

    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar() {
        System.out.println("Pausando música");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada - " + musica);
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo o site: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando site");
    };
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }
    public void atender() {
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    } 

}
