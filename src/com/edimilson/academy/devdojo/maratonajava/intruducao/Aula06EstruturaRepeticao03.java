package com.edimilson.academy.devdojo.maratonajava.intruducao;
/*  estrutura break
* */
public class Aula06EstruturaRepeticao03 {
    public static void main(String[] args) {
        // imprimar os primeiros 25 números de um dado valor, exemplo 50

        int numberMax = 50;
        for (int i = 0; i <= numberMax; i++) {
            if ( i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
