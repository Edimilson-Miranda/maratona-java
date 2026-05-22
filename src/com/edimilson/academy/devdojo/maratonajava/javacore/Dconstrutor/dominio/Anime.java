package com.edimilson.academy.devdojo.maratonajava.javacore.Dconstrutor.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodio, String genero) {
        this();                     // após instancia, vai chama o this() que passa o construtor vazio da linha 23.
        this.nome = nome;          // após terminar o construtor da linha 23, volta para executar
        this.tipo = tipo;         // as variaveis nome, tipo, episodio e genero
        this.episodio = episodio;
        this.genero = genero;     // após terminar de executa o bloco de todas as 4 variaveis, pula para
    }                             // construtor da linha 18, para executa a variavel estudio.

    public Anime(String nome, String tipo, int episodio, String genero, String estudio) {
        this(nome, tipo, episodio, genero); // vai instancia e chama o construtor da linha 10.
        this.estudio = estudio;
    }

    public Anime() {

    }  // após terminar de executa o construtor vazio, voulta para construtor da linha 10

//    public void init(String nome, String tipo, int episodio) {
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodio = episodio;
//    }

//    public void init(String nome, String tipo, int episodio, String genero) {
//        this.init(nome, tipo, episodio);
//        this.genero = genero;
//    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return this.episodio;
    }
}
