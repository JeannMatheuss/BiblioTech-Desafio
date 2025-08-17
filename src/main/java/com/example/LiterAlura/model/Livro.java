package com.example.LiterAlura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String idioma;
    private int numeroDeDownloads;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;



    public Livro() {
    }

    public Livro(DadosLivro dadosLivro, Autor autor) {
        this.titulo = dadosLivro.titulo();

        if (dadosLivro.idiomas() != null && !dadosLivro.idiomas().isEmpty()) {
            this.idioma = dadosLivro.idiomas().get(0);
        } else {
            this.idioma = "Idioma desconhecido";
        }

        this.numeroDeDownloads = dadosLivro.numeroDeDownloads();
        this.autor = autor; // atribuindo o objeto Autor
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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
        return "Titulo= " + titulo +
                ", Nome do Autor= " + (autor != null ? autor.getNome() : "Desconhecido") +
                ", idioma= " + idioma +
                ", Numero De Downloads= " + numeroDeDownloads;
    }

}
