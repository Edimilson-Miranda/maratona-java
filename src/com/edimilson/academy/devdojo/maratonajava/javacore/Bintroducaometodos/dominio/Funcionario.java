package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;  // três salário deve ser armazenado

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null)  {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + ", ");
        }
    }

    public void imprimirMediaSalario() {
        if (salarios == null)  {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.printf("\nMédia salarial: %.2f%n", media);
    }

}





