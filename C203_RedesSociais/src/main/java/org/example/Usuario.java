package org.example;

public class Usuario {

    private String nome;
    private String email;
    RedeSocial[] redesocial = new RedeSocial[4];

    public Usuario(RedeSocial[] redesocial) {
        this.redesocial = redesocial;
    }

    //Getters e setters para os private

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedesocial() {
        return redesocial;
    }

    public void setRedesocial(RedeSocial[] redesocial) {
        this.redesocial = redesocial;
    }
}
