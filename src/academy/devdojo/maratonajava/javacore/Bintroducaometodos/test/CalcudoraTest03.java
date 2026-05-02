package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalcudoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(21,2);
        System.out.println(result);
        System.out.println("-------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(21,0);
    }


}
