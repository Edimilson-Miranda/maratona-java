package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

//        pessoa.nome = "Goku";
//        pessoa.idade = 29;
//        pessoa.imprime();

        pessoa.setNome("Ichigo kurosaki");
        pessoa.setIdade(30);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
