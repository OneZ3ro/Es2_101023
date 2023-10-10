package entities;

import java.util.HashMap;

//public class User implements Comparable<User> {
public class User {
    private String nome;
    private String numeroTel;

    public User(String nome, String numeroTel) {
        this.nome = nome;
        this.numeroTel = numeroTel;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", numeroTel='" + numeroTel + '\'' +
                '}';
    }
}