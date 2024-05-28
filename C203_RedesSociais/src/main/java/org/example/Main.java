package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciando
        RedeSocial[] rede = new RedeSocial[4];
        Instagram instagram = new Instagram("123554", 105);
        GooglePlus google = new GooglePlus("111111", 1050);
        Twitter twitter = new Twitter("616351",120);
        Facebook facebook = new Facebook("16415351",1250);
        rede[0] = instagram;
        rede[1] = google;
        Usuario usuario = new Usuario(rede);

        //Definindo o nome e email do usuário, além de mostrar as infos
        usuario.setNome("Mateus");
        usuario.setEmail("mateus123@gmail.com");
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("E-mail do usuário: " + usuario.getEmail());
        System.out.println();

        // Utilizando do try-catch
        for (int i = 0; i < usuario.getRedesocial().length; i++) {
            if (usuario.getRedesocial()[i] != null) {

                try {
                    if (usuario.getRedesocial()[i] instanceof Facebook) {
                        Facebook face = (Facebook) usuario.getRedesocial()[i];

                        face.compartilhar();
                        face.curtirPublicacao();
                        face.fazStreaming();

                    } else
                        if (usuario.getRedesocial()[i] instanceof Twitter) {
                        Twitter tt = (Twitter) usuario.getRedesocial()[i];

                        tt.compartilhar();
                        tt.postarFoto();
                        tt.postarVideo();

                    } else
                        if (usuario.getRedesocial()[i] instanceof Instagram) {
                        Instagram insta = (Instagram) usuario.getRedesocial()[i];

                        insta.postarComentario();
                        insta.postarFoto();
                        insta.curtirPublicacao();

                    } else
                        if (usuario.getRedesocial()[i] instanceof GooglePlus) {
                        GooglePlus googleP = (GooglePlus) usuario.getRedesocial()[i];

                        googleP.compartilhar();
                        googleP.fazStreaming();
                        googleP.postarVideo();
                    }

                } catch(NullPointerException e){ //Lidando com um possível erro
                    System.out.println("Foi encontrado um erro: "+e.getMessage());
                }
                System.out.println();
            }
        }
    }
}