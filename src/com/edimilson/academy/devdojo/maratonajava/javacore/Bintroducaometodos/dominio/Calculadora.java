package com.edimilson.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public int somarDoisNumeros(int numero1, int numero2) {
        System.out.println("Iniciando a somar:");
        return numero1 + numero2;
    }

    public int subtrairDoisNumeros(int numero1, int numero2) {
        System.out.println("Iniciando a subtrair:");
        return numero1 - numero2;
    }

    public int multiplicarDoisNumeros(int num1, int num2) {
        System.out.println("Iniciando a multiplicar:");
        return num1 * num2;
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            System.out.println(num1 / num2);
        }
        return 0;
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
    }
}
