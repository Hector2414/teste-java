package biblioteca;

import java.util.Scanner;

public class Biblioteca {

	
	
		
		   Livro[] livros;
		    int quantidadeDeLivros;

		    public Biblioteca(int capacidade) {
		        livros = new Livro[capacidade];
		        quantidadeDeLivros = 0;
		    }

		    public void adicionarLivro(Livro livro) {
		        if (quantidadeDeLivros < livros.length) {
		            livros[quantidadeDeLivros] = livro;
		            quantidadeDeLivros++;
		            System.out.println("Livro adicionado com sucesso!");
		        } else {
		            System.out.println("Biblioteca cheia. Não é possível adicionar mais livros.");
		        }
		    }

		    public Livro buscarLivro(String titulo) {
		        for (int i = 0; i < quantidadeDeLivros; i++) {
		            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
		                return livros[i];
		            }
		        }
		        System.out.println("Livro não encontrado.");
		        return null;
		    }

		    public void emprestarLivro(String titulo) {
		        Livro livro = buscarLivro(titulo);
		        if (livro != null) {
		            livro.emprestar();
		        }
		    }

		    public void devolverLivro(String titulo) {
		        Livro livro = buscarLivro(titulo);
		        if (livro != null) {
		            livro.devolver();
		        }
		    }

		    public void exibirDetalhesLivro(String titulo) {
		        Livro livro = buscarLivro(titulo);
		        if (livro != null) {
		            livro.exibirDetalhes();
		        }
		    }

		    public static void main(String[] args) {
		        Biblioteca biblioteca = new Biblioteca(100); // Capacidade de 100 livros
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\nMenu:");
		            System.out.println("1. Adicionar livro");
		            System.out.println("2. Exibir detalhes do livro");
		            System.out.println("3. Emprestar livro");
		            System.out.println("4. Devolver livro");
		            System.out.println("5. Sair");
		            System.out.print("Escolha uma opção: ");
		            int opcao = scanner.nextInt();
		            scanner.nextLine(); // Consumir a nova linha

		            if (opcao == 1) {
		                System.out.print("Digite o título do livro: ");
		                String titulo = scanner.nextLine();
		                System.out.print("Digite o autor do livro: ");
		                String autor = scanner.nextLine();
		                Livro livro = new Livro(titulo, autor);
		                biblioteca.adicionarLivro(livro);
		            } else if (opcao == 2) {
		                System.out.print("Digite o título do livro: ");
		                String titulo = scanner.nextLine();
		                biblioteca.exibirDetalhesLivro(titulo);
		            } else if (opcao == 3) {
		                System.out.print("Digite o título do livro: ");
		                String titulo = scanner.nextLine();
		                biblioteca.emprestarLivro(titulo);
		            } else if (opcao == 4) {
		                System.out.print("Digite o título do livro: ");
		                String titulo = scanner.nextLine();
		                biblioteca.devolverLivro(titulo);
		            } else if (opcao == 5) {
		                System.out.println("Saindo...");
		                break;
		            } else {
		                System.out.println("Opção inválida. Tente novamente.");
		            }
		        }

		        scanner.close();
		    }
		
		

	}


