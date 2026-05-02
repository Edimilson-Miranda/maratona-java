package academy.devdojo.maratonajava.intruducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Padrões em Arrays
        // byte, short, int, long, float, double = 0
        // char '\u0000' ' '
        // boolean = false
        // String null
        // Valores  padrão para arrays ou fora do métedo

        // Em arrays do tipo inteiro, voce nao pode passa o valor flutuante
        // sem antes fazer um casting

        String[] idades = new String[3];

        idades[0] = "Luffy";
        idades[1] = "Goku";
        idades[2] = "Vegeta";

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
