package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Ichigo";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Rukia";
        estudante2.idade = 29;
        estudante2.sexo = 'F';

        estudante1.imprimir();

        estudante2.imprimir();
    }
}
