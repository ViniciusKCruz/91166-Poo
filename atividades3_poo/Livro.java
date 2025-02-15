package atividades3_poo;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private double preco;
    private String ibsnDoLivro;


    
    public Livro(String titulo, String autor, int numeroDePaginas, double preco, String ibsnDoLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.preco = preco;
        this.ibsnDoLivro = ibsnDoLivro;
    }
    
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
    public String getIbsnDoLivro() {
        return ibsnDoLivro;
    }
    public void setIbsnDoLivro(String ibsnDoLivro) {
        this.ibsnDoLivro = ibsnDoLivro;
    }

   
}
