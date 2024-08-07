package senai.mga;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	   private List<Contato> contatos;

	    public Agenda() {
	        this.contatos = new ArrayList<>();
	    }

	    public void adicionarContato(Contato contato) {
	        contatos.add(contato);
	    }

	    public Contato buscarContato(String nome) {
	        for (Contato contato : contatos) {
	            if (contato.getContatoNome().equalsIgnoreCase(nome)) {
	                return contato;
	            }
	        }
	        return null;
	    }

	    public List<Contato> listarContatos() {
	        return contatos;
	    }
	}

	class Contato {
	    private String contatoNome;
	    private String telefone;

	    public Contato(String contatoNome, String telefone) {
	        this.contatoNome = contatoNome;
	        this.telefone = telefone;
	    }

	    public String getContatoNome() {
	        return contatoNome;
	    }

	    public String getTelefone() {
	        return telefone;
	    }
}
