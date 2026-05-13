package com.edimilson.academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import com.edimilson.academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

    //    anime.init("Bleach", "TV", 24);
        anime.init("Bleach", "TV", 24, "Açao");
    //    anime.setNome("Bleach");
    //    anime.setTipo("TV");
    //    anime.setEpisodio(24);
        anime.imprime();
    }
}
