# 📚 BiblioTech

O **BiblioTech** é uma aplicação em **Java + Spring Boot + JPA + PostgreSQL** que consome a API do [Gutendex](https://gutendex.com/) para buscar informações sobre livros e autores.  
A aplicação permite armazenar, consultar e listar dados de livros e autores em um banco de dados relacional.

---

## 🚀 Funcionalidades

- 🔎 **Buscar livros** por título na API do Gutendex.  
- 💾 **Salvar livros** encontrados no banco de dados.  
- 📖 **Listar todos os livros** registrados.  
- 👤 **Listar todos os autores** registrados.  
- 📆 **Listar autores vivos** em um determinado ano.  
- 🌎 **Listar livros por idioma**.  

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 17+**  
- 🌱 **Spring Boot**  
- 🗄️ **Spring Data JPA**  
- 🐘 **PostgreSQL**  
- 🌐 **Gutendex API**  

---

## 📂 Estrutura do Projeto

```
├── model/
│ ├── Autor.java
│ ├── Livro.java
│ └── DadosLivro.java
│
├── repository/
│ ├── AutorRepository.java
│ └── LivroRepository.java
│
├── service/
│ └── ConsumoApi.java
│
├── principal/
│ └── Principal.java
│
└── LiterAluraApplication.java
```

## 👨‍💻 Autor

Projeto desenvolvido por Jean Matheus Mohamed de Oliveira no Projeto Oracle One.
