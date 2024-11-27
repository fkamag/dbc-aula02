import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);
  static Livro[] livros = new Livro[0];

  public static void main(String[] args) {

    while (true) {
      System.out.println("Menu");
      System.out.println("=========");
      System.out.println("1 - Adicionar livro");
      System.out.println("2 - Remover livro");
      System.out.println("3 - Listar livro");
      System.out.println("4 - Buscar livro");
      System.out.println("5 - Emprestar livro");
      System.out.println("6 - Devolver livro");
      System.out.println("7 - Adicionar usuário");
      System.out.println("8 - Listar usuários");
      System.out.println("9 - Sair");

      System.out.print("Escolha a opção: ");
      int menuOption = scanner.nextInt();

      switch (menuOption) {
        case 1:
          cadastrarLivro();
          break;
        case 2:
          System.out.println("Remover livro");
          break;
        case 3:
          listarLivros();
          break;
        case 4:
          System.out.println("Buscar livro");
          break;
        case 5:
          System.out.println("Emprestar livro");
          break;
        case 6:
          System.out.println(" livro");
          break;
        case 9:
          System.out.println("Obrigado ! ! !");
          return;
      }
    }

  }

  public static void cadastrarLivro() {
    System.out.println("Cadastro de Livro");
    scanner.nextLine();
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Autor: ");
    String autor = scanner.nextLine();
    System.out.print("Ano de Publicação: ");
    int anoPublicacao = scanner.nextInt();

    Livro livro = new Livro(titulo, autor, anoPublicacao);
    Livro[] novoArray = Arrays.copyOf(livros, livros.length + 1);
    novoArray[livros.length] = livro;
    livros = novoArray;
  }

  public static void listarLivros() {
    for (Livro livro : livros) {
      System.out.printf("""
          Título: %s
          Autor: %s
          Ano de Publicação: %d
          Disponibilidade: %b
          =========================
          """, livro.titulo, livro.autor, livro.anoPublicacao, livro.disponibilidade);
    }
  }

  static class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao) {
      this.titulo = titulo;
      this.autor = autor;
      this.anoPublicacao = anoPublicacao;
      this.disponibilidade = true;
    }
  }

}
