package com.example.LiterAlura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String nomeAutor;
    private String idioma;
    private int numeroDeDownloads;

    public Livro() {
    }

    public Livro(DadosLivro dadosLivro) {
        this.titulo = dadosLivro.titulo();

        if (dadosLivro.authors() != null && !dadosLivro.authors().isEmpty()) {
            this.nomeAutor = dadosLivro.authors().get(0).nome();
        } else {
            this.nomeAutor = "Autor desconhecido";
        }

        if (dadosLivro.idiomas() != null && !dadosLivro.idiomas().isEmpty()) {
            this.idioma = dadosLivro.idiomas().get(0);  // pega o primeiro idioma
        } else {
            this.idioma = "Idioma desconhecido";
        }

        this.numeroDeDownloads = dadosLivro.numeroDeDownloads();
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
