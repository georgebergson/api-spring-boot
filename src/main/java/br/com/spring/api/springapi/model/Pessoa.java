package br.com.spring.api.springapi.model;


public class Pessoa {
    private String nome;
    private int idade;

    // getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

}