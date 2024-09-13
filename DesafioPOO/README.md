## Resolução do Desafio de POO
```mermaid
classDiagram
    iPhone --|> ReprodutorMusica
    iPhone --|> Navegador
    iPhone --|> AparelhoTelefonico
    
    class ReprodutorMusica{
      +void tocar()
      +void pausar()
      +void selecionarMusica(String musica) 
    }
    class AparelhoTelefonico{
      +void ligar(String numero)
      +void atender()
      +void iniciarCorreioVoz()
    }
    class Navegador{
      + void exibirPagina(String url)
      + void adicionarNovaAba()
      + void atualizarPagina()
    }
```
