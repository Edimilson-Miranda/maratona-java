package com.edimilson.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Zoro";
        estudante2.idade = 28;
        estudante2.sexo = 'M';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
