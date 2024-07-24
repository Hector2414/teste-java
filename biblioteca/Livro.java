package biblioteca;

public class Livro {

	 private String titulo;
	    private String autor;
	    private boolean emprestado;

	    public Livro(String titulo, String autor) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.emprestado = false;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public boolean isEmprestado() {
	        return emprestado;
	    }

	    public void emprestar() {
	        if (!emprestado) {
	            emprestado = true;
	            System.out.println("\n");
	            System.out.println("\nLivro emprestado com sucesso!");
	        } else {
	            System.out.println("Livro já está emprestado.");
	        }
	    }

	    public void devolver() {
	        if (emprestado) {
	            emprestado = false;
	            System.out.println("\n");
	            System.out.println("Livro devolvido com sucesso!");
	        } else {
	        	System.out.println("\n");
	            System.out.println("Livro não está emprestado.");
	        }
	    }

	    public void exibirDetalhes() {
	    	System.out.println("\n");
	    	System.out.println("-------------------------");
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));
	        System.out.println("-------------------------");
	    }
     
    
}
