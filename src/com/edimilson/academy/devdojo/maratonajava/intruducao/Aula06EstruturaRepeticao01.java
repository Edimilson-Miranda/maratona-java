package com.edimilson.academy.devdojo.maratonajava.intruducao;

/*      While, do-while e for
*/
public class Aula06EstruturaRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        count  = 0;
        do {
            System.out.println("Dentro do do-while " + count);
            count++;
        }while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
