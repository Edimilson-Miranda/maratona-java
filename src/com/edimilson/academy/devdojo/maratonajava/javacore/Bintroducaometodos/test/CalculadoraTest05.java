package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somarArrays(numeros);

        calculadora.somarVarArgs(numeros);

        calculadora.somarVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
