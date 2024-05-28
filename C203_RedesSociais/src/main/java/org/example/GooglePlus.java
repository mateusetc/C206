package org.example;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Google+!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo streaming no Google+!");
    }

    //Métodos das redes sociais

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Google+!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Google+!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Google+!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Google+!");
    }
}
