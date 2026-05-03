package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int result = calculadora.somarDoisNumeros(20, 30);
        System.out.println(result);
        System.out.println("Finalizado CalculadoraTest01");

        int resultado = calculadora.subtrairDoisNumeros(50, 10);
        System.out.println(resultado);
    }
}
