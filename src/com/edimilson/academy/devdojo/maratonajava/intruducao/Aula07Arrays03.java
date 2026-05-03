package com.edimilson.academy.devdojo.maratonajava.intruducao;

/*     O forEach é uma forma simplificada de percorrer (iterar)
    elementos de coleções, como listas, arrays e conjuntos.
    Ele foi introduzido a partir do Java 8
    e usa programação funcional com expressões lambda.
* */
public class Aula07Arrays03 {
    public static void main(String[] args) {
       int[] numeros = new int[]{1, 2, 3, 4, 5};
       int[] numeros2 = new int[]{8, 7, 6, 5, 4};

       /*
       for (int i = 0; i < numeros2.length; i++) {
           System.out.println(numeros2[i]);
       }*/

        for (int num: numeros2) {
            System.out.println(num);
        }

    }
}
