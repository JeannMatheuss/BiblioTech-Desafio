package com.example.LiterAlura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Livro {
    private Long id;
    private String titulo;
    private String nomeAutor;
    private String idioma;
    private int numeroDeDownloads;

    public Livro(Long id, String titulo, String nomeAutor, String idioma, int numeroDeDownloads) {
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.idioma = idioma;
        this.numeroDeDownloads = numeroDeDownloads;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumeroDeDownloads() {
        return numeroDeDownloads;
    }

    public void setNumeroDeDownloads(int numeroDeDownloads) {
        this.numeroDeDownloads = numeroDeDownloads;
    }

    @Override
    public String toString() {
        return
                "Titulo= " + titulo + '\'' +
                ", Nome do Autor= " + nomeAutor + '\'' +
                ", idioma= " + idioma + '\'' +
                ", Numero De Downloads= " + numeroDeDownloads;
    }
}
