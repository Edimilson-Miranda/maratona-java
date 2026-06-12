package com.edimilson.academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 270);
        Carro c3 = new Carro("Corvete", 290);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
