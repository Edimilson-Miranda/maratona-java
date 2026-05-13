package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;  // três salário deve ser armazenado
    private double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null)  {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimirMediaSalario() {
        if (salarios == null)  {
            return;
        }
        for (double salario : this.salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.printf("\nMédia salarial: %.2f%n", media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}





