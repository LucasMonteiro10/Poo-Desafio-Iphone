package edu.lucas.dispositivos;

import edu.lucas.ferramentas.AparelhoTelefonico;
import edu.lucas.ferramentas.NavegadorInternet;
import edu.lucas.ferramentas.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String nomePagina) {
        System.out.println("Exibindo a página " + nomePagina + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando a nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando a música " + nomeMusica + "...");
    }
    
}
