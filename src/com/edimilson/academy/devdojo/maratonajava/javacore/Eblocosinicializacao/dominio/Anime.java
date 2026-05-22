package com.edimilson.academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memoria por objeto
    // 2 - Cada atributos de classes é criado e inicializado os valores default e o quer for passado
    // 3 - Bloco de inicialização é execitado
    // 4 - Construtor é executado;

    {
        System.out.println("Dentro do bloco de inicialização");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
