package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Pedro";
        funcionario.idade = 30;
        funcionario.salarios = new double[]{1200, 978.32, 2000};

        funcionario.imprimir();

        funcionario.imprimirMediaSalario();
    }
}
