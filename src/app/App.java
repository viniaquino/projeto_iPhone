package app;

import impl.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Usando o iPhone como reprodutor musical
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.selecionarMusica("Minha Musica Favorita");

        // Usando o iPhone como aparelho telefônico
        meuIphone.fazerChamada("123456789");
        meuIphone.atenderChamada();
        meuIphone.encerrarChamada();

        // Usando o iPhone como navegador na internet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba("https://www.example.com");
        meuIphone.atualizarPagina();
    }
}
