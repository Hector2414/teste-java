package senai_mga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarefa {
	private double numeroPrioridade;
    private String nomeTarefa;
    private Date dataLimiteExecucao;
    private String detalhamento;
    private double percentualConclusao;
    private List<ItensExecucao> itensExecucao;

    // Construtor
    public Tarefa(double numeroPrioridade, String nomeTarefa, Date dataLimiteExecucao, String detalhamento) {
        this.numeroPrioridade = numeroPrioridade;
        this.nomeTarefa = nomeTarefa;
        this.dataLimiteExecucao = dataLimiteExecucao;
        this.detalhamento = detalhamento;
        this.percentualConclusao = 0.0;
        this.itensExecucao = new ArrayList<>();
    }

    // Adiciona um item de execução
    public void adicionarItem(ItensExecucao item) {
        itensExecucao.add(item);
        calcularPercentualConclusao();
    }

    // Calcula o percentual de conclusão baseado nos itens de execução
    private void calcularPercentualConclusao() {
        if (itensExecucao.isEmpty()) {
            percentualConclusao = 0.0;
            return;
        }
        double somaPercentuais = 0.0;
        for (ItensExecucao item : itensExecucao) {
            somaPercentuais += item.getPercentual();
        }
        percentualConclusao = somaPercentuais / itensExecucao.size();
    }

    // Getters e Setters
    public double getNumeroPrioridade() { return numeroPrioridade; }
    public void setNumeroPrioridade(double numeroPrioridade) { this.numeroPrioridade = numeroPrioridade; }

    public String getNomeTarefa() { return nomeTarefa; }
    public void setNomeTarefa(String nomeTarefa) { this.nomeTarefa = nomeTarefa; }

    public Date getDataLimiteExecucao() { return dataLimiteExecucao; }
    public void setDataLimiteExecucao(Date dataLimiteExecucao) { this.dataLimiteExecucao = dataLimiteExecucao; }

    public String getDetalhamento() { return detalhamento; }
    public void setDetalhamento(String detalhamento) { this.detalhamento = detalhamento; }

    public double getPercentualConclusao() { return percentualConclusao; }

    public List<ItensExecucao> getItensExecucao() { return itensExecucao; }
	
}
