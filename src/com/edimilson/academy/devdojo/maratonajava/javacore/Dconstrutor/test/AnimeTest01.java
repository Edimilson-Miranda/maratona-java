package com.edimilson.academy.devdojo.maratonajava.javacore.Dconstrutor.test;


import com.edimilson.academy.devdojo.maratonajava.javacore.Dconstrutor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("xxxHOLIC", "TV", 24, "Sobrenatural", "Production IG");

    //    anime.init("Bleach", "TV", 24);

    //    anime.init("Bleach", "TV", 24, "Açao");

    //    anime.setNome("Bleach");
    //    anime.setTipo("TV");
    //    anime.setEpisodio(24);

        anime.imprime();
    }
}
