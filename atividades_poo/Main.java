package atividades_poo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja cadastrar quantos livros?");
        int livros = sc.nextInt();

        int []quantidade = new int[livros];

        for(int i = 1; i <= quantidade.length; i++){
        Livro livro = new Livro();

        
        livro.solicitarTitulo();
        livro.solicitarAutor();
        livro.solicitarPaginas();
        livro.solicitarPreco();
        System.out.println();
        
        System.out.println("===========================================");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Quantidade: " + livro.getNumeroDePaginas());
        System.out.println("Preco: " + livro.getPreco());
        System.out.println("===========================================");
        
        }
    }

}
