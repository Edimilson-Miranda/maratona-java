package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corrola";
        carro1.modelo = "Toyota";
        carro1.ano = 2023;

        carro2.nome = "City";
        carro2.modelo = "Honda";
        carro2.ano = 2019;

        System.out.println("Carro 1");
        System.out.println("Carro: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println("Carro: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
