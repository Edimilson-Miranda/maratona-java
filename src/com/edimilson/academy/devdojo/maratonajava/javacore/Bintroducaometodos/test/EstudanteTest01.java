package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora =  new ImpressoraEstudante();

        estudante1.nome = "Ichigo";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Rukia";
        estudante2.idade = 29;
        estudante2.sexo = 'F';

        impressora.imprimir(estudante1);

        impressora.imprimir(estudante2);
    }
}
