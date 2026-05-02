package academy.devdojo.maratonajava.intruducao;

/*  Exercicio de for
* */
public class Aula06EstruturaRepeticao02 {
    // imprimar os números pares de 0 até 1000000
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
