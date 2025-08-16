package com.example.LiterAlura.principal;

import com.example.LiterAlura.service.ConsumoApi;
import com.example.LiterAlura.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados coversor = new ConverteDados();
    private final String ENDERECO = "gutendex.com/books";
}
