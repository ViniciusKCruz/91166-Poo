package atividades_poo;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private double preco;

                    
    // public Livro(String titulo, String autor, int numeroDePaginas, double preco) {
    //     this.titulo = titulo;
    //     this.autor = autor;
    //     this.numeroDePaginas = numeroDePaginas;
    //     this.preco = preco;
    // }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    Scanner sc = new Scanner(System.in);

    public void solicitarTitulo() {
        System.out.print("Por favor, insira o nome do livro: ");
        this.titulo = sc.nextLine(); // Armazena o dado diretamente no atributo
    }

    public void solicitarAutor() {
           System.out.print("Por favor, insira o nome do autor: ");
           this.autor = sc.nextLine(); // Armazena o dado diretamente no atributo
       }

       public void solicitarPaginas() {
           System.out.print("Por favor, insira a quantidade de páginas: ");
           this.numeroDePaginas = sc.nextInt(); // Armazena o dado diretamente no atributo
       }

       public void solicitarPreco() {
           System.out.print("Por favor, insira o preco do livro: ");
           this.preco = sc.nextDouble(); // Armazena o dado diretamente no atributo
           //
       }
}

