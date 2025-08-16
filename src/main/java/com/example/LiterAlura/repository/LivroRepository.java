package com.example.LiterAlura.repository;

import com.example.LiterAlura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
