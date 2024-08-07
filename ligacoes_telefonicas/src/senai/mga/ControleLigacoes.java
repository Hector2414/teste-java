package senai.mga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControleLigacoes {

	private List<Ligacao> ligacoes;
    private Agenda agenda;

    public ControleLigacoes() {
        this.ligacoes = new ArrayList<>();
        this.agenda = new Agenda();
    }

    public void registrarLigacao(Date data, long minutos, String telefone) {
        Ligacao ligacao = new Ligacao(data, minutos, telefone);
        ligacoes.add(ligacao);
    }

    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        agenda.adicionarContato(contato);
    }

    public Contato buscarContato(String nome) {
        return agenda.buscarContato(nome);
    }

    public List<Ligacao> listarLigacoes(Date inicio, Date fim) {
        List<Ligacao> resultado = new ArrayList<>();
        for (Ligacao ligacao : ligacoes) {
            if (!ligacao.getData().before(inicio) && !ligacao.getData().after(fim)) {
                resultado.add(ligacao);
            }
        }
        return resultado;
    }

    public double calcularValorTotal(Date inicio, Date fim) {
        double total = 0.0;
        for (Ligacao ligacao : listarLigacoes(inicio, fim)) {
            total += ligacao.getValor();
        }
        return total;
    }
}
