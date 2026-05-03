package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(21,2);
        System.out.println(result);
        System.out.println("-------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(21,0);
    }


}
