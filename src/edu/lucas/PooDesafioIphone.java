package edu.lucas;

import edu.lucas.dispositivos.Iphone;

public class PooDesafioIphone {

    public static void main(String[] args) {
        Iphone mobile = new Iphone();
        
        System.out.println("Funções de reprodutor musical do iPhone:");
        mobile.selecionarMusica("Take On Me - a-ha");
        mobile.tocar();
        mobile.pausar();
        System.out.println("");
        
        System.out.println("Funções de aparelho telefônico do iPhone:");
        mobile.ligar("(81)19622-2342");
        mobile.atender();
        mobile.iniciarCorreioVoz();
        System.out.println("");
        
        System.out.println("Funções de navegador de intenet do iPhone:");
        mobile.exibirPagina("https://web.dio.me/");
        mobile.adicionarNovaAba();
        mobile.atualizarPagina();
    }
    
}
