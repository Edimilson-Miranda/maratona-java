package com.edimilson.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 70;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome
                + ", Idade: " + professor.idade + ", Sexo: " + professor.sexo);
    }
}
