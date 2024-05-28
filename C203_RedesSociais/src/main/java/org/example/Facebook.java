package org.example;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println(" compartilhou uma foto no facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println(" está fazendo uma live no facebook!");
    }

    //Métodos da rede social
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no facebook!");
    }
}
