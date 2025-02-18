package com.example.demo;

import jakarta.persistence.Entity;

@Entity
public class Pessoa {
    private Long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(Long id, String nome, String sobrenome, int idade, double altura) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString para exibir informaçõessss teste
    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
