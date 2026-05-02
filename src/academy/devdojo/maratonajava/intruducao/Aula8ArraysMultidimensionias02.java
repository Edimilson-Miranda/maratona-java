package academy.devdojo.maratonajava.intruducao;

public class Aula8ArraysMultidimensionias02 {
    public static void main(String[] args) {
        int[][] arraysInt = new int[3][];

        arraysInt[0] = new int[2];
        arraysInt[1] = new int[]{3, 6, 9};
        arraysInt[2] = new int[]{1, 3, 4, 6, 7, 8};

        int[][] arraysInt2 =  {{0,0}, {3,6,9}, {1, 3, 4, 6, 7, 8}};

        for (int[] arrBase:  arraysInt2) {
            System.out.println("\n---------------");
            for (int num:arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
