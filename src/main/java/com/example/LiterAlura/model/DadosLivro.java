package com.example.LiterAlura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(@JsonAlias("id")Long id,
                         @JsonAlias("title") String titulo,
                         @JsonAlias("authors") String nomeAutor,
                         @JsonAlias("languages") String idioma,
                         @JsonAlias("download_count") int numeroDeDownloads) {
}
