package impl;

import base.ReprodutorMusical;
import base.AparelhoTelefonico;
import base.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica() {
        // Implementação do método
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        // Implementação do método
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação do método
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        // Implementação do método
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        // Implementação do método
        System.out.println("Atendendo chamada");
    }

    @Override
    public void encerrarChamada() {
        // Implementação do método
        System.out.println("Encerrando chamada");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Implementação do método
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação do método
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        // Implementação do método
        System.out.println("Atualizando página");
    }
}
