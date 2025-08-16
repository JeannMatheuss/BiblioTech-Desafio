package com.example.LiterAlura.principal;

import com.example.LiterAlura.model.DadosLivro;
import com.example.LiterAlura.model.DadosResultado;
import com.example.LiterAlura.model.Livro;
import com.example.LiterAlura.repository.LivroRepository;
import com.example.LiterAlura.service.ConsumoApi;
import com.example.LiterAlura.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://gutendex.com/books/?search=";

    private LivroRepository repositorio;

    List<Livro> livros = new ArrayList<>();

    public Principal(LivroRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Buscar livro pelo título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado ano
                    5 - Listar livros em um determinado idioma
                    
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroPeloTitulo();
                    break;
                case 2:
                    listarLivrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosPorAno();
                    break;
                case 5:
                    listarLivrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void buscarLivroPeloTitulo() {
        DadosLivro dadosLivro = getDadosLivro();

        if (dadosLivro == null) {
            System.out.println("Não foi possível cadastrar o livro, pois não houve resultados.");
            return;
        }

        Livro livro = new Livro(dadosLivro);
        repositorio.save(livro);
        System.out.println("Livro salvo com sucesso: " + livro.getTitulo());

    }

    private DadosLivro getDadosLivro() {
        System.out.println("Digite o nome do livro para busca");
        var nomeLivro = leitura.nextLine();
        var json = consumoApi.obterDados(ENDERECO + nomeLivro.replace(" ", "+"));

        // Converte para objeto que contém a lista de resultados
        var resultado = conversor.obterDados(json, DadosResultado.class);

        if (resultado.results().isEmpty()) {
            System.out.println("Nenhum livro encontrado!");
            return null;
        }

        return resultado.results().get(0); // pega o primeiro livro encontrado
    }

    private void listarLivrosRegistrados() {
    }

    private void listarAutoresRegistrados() {
    }

    private void listarAutoresVivosPorAno() {
    }

    private void listarLivrosPorIdioma() {
    }
}
