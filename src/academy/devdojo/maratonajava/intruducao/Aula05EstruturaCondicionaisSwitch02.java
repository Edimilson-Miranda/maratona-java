package academy.devdojo.maratonajava.intruducao;
import java.util.Scanner;

/*
*   Utilizando switch e dados os valores de 1 a 7,
*   imprimar se é dia útil ou final de semaan
*   considerando que 1 é domingo.
* */
public class Aula05EstruturaCondicionaisSwitch02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Digite um dia da semana de 1 a 7: ");
        byte diaUtilDaSemana = sc.nextByte();
        switch (diaUtilDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
