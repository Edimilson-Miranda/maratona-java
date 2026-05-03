package com.edimilson.academy.devdojo.maratonajava.intruducao;


import java.util.Scanner;

/*
*
* */
public class Aula05EstruturaCondicioanisSwitch01 {
    public static void main(String[] args) {

    }

    /*
    *  Estrutura condicionais switch
    *   char, int, byte, short, enum, String
    * */
    public static class Aula05EstruturaCondicionais01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // imprimir os dias da semana, sendo que 1 é domingo.
            System.out.print("Digite um numero da semana: ");
            byte diaSemana = sc.nextByte();
            switch (diaSemana) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Dia inválido!");
                    break;
            }

            // imprimir o género da pessoa sendo que M é masculino e F de feminino.
            System.out.println("Digite um género, sendo que M é de masculino e F de feminino: ");
            char sexoPessoa = sc.next().charAt(0);
            switch (sexoPessoa) {
                case 'M':
                    System.out.println("Homen");
                    break;
                case 'F':
                    System.out.println("Mulher");
                    break;
                default:
                    System.out.println("Género inválido!");
                    break;

            }
        }
    }
}
