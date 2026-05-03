package com.edimilson.academy.devdojo.maratonajava.intruducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
        *  Operadores básico Aritemitico
        *   + - / *
        * */

        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        double resultadoD = (double) numero1 / numero2; // casting fazendo uma divisão forçada de
                                                        // dois números inteiros
        System.out.println(resultado);
        System.out.println(resultadoD);

        /*
        *  Operadores Relacionais
        *       <   >  <=   >=   ==  !=
        * */

        boolean isDezMaiorQueVinte = 10 > 20;       // false
        boolean isDezMenorQueVinte = 10 < 20;       // true
        boolean isDezIgualQueVinte = 10 == 20;      // false
        boolean isDezIgualDez = 10 == 10;           // true
        boolean isDezDiferenteQueDez = 10 != 10;    // false
        boolean isDezMaiorIgualVinte = 10 >= 20;    // false
        boolean isDezMenorIgualVinte = 10 <= 20;    // true

        /*
        *  Operadores lógicos
        *       && (AND)   || (OR)  ! (NOT)
        * */

        int idade = 29;
        double salario = 3500.0;

        boolean isDentroLeiMaiorQueTrinta = idade > 30 &&  salario >= 4612; // false
        // Operador AND necessida que duas opção seja verdadeira
        boolean isDentroLeiMenorQueTrinta = idade < 30 && salario > 3381;  // false


        int idade1 = 29;
        double salario1 = 3500.0;
        boolean isDentroLeiMaiorQueTrinta1 = idade1 >= 30 && salario1 >= 4612; // false
        // Operador AND necessida que duas opção seja verdadeira
        boolean isDentroLeiMenorQueTrinta1 = idade1 < 30 && salario1 >= 3381;  // true
        // Operador AND necessida que duas opção seja verdadeira

        // Operador || (OR)

        double valorTotalContaCorrente = 200.0;
        double valorTotalContaPoupanca = 10000.0;
        double valorCompraPlayStation = 5000.0;

        boolean valorCompravel = valorTotalContaCorrente > valorCompraPlayStation || valorTotalContaPoupanca > valorCompraPlayStation;
        // true  pois uma das opção é verdade

    } // fim da classe main
} // fim da classe Aula04Operadores
