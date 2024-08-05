package senai_mga;

import java.util.Date;

public class ItensExecucao {

	private double percentual;
    private String descricao;
    private Date dataExecucao;

    // Construtor
    public ItensExecucao(double percentual, String descricao, Date dataExecucao) {
        this.percentual = percentual;
        this.descricao = descricao;
        this.dataExecucao = dataExecucao;
    }

    // Getters e Setters
    public double getPercentual() { return percentual; }
    public void setPercentual(double percentual) { this.percentual = percentual; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Date getDataExecucao() { return dataExecucao; }
    public void setDataExecucao(Date dataExecucao) { this.dataExecucao = dataExecucao; } 
}
