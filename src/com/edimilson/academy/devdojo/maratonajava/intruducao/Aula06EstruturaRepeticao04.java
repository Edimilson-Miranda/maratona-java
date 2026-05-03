package com.edimilson.academy.devdojo.maratonajava.intruducao;

import java.util.Scanner;

/*  dado o valor de um carro, descubra em quantas parcelas ele pode
    ser parcelado condeição valorParcela >= 1000
* */
public class Aula06EstruturaRepeticao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal =  sc.nextDouble();

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " +  parcela + " R$ " + valorParcela);
        }
    }
}
