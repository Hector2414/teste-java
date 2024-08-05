package senai_mga;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        List<ItensExecucao> itens = new ArrayList<>();
	        
	        try {
	            // Captura das informações da tarefa
	            System.out.println("Digite o número da prioridade:");
	            double numeroPrioridade = scanner.nextDouble();
	            scanner.nextLine(); // Consumir o newline
	           
	            System.out.println("Digite o nome da tarefa:");
	            String nomeTarefa = scanner.nextLine();
	            
	            System.out.println("Digite a data limite de execução (dd/MM/yyyy):");
	            Date dataLimiteExecucao = sdf.parse(scanner.nextLine());
	            
	            System.out.println("Digite o detalhamento da tarefa:");
	            String detalhamento = scanner.nextLine();
	            
	            // Criação da tarefa
	            Tarefa tarefa = new Tarefa(numeroPrioridade, nomeTarefa, dataLimiteExecucao, detalhamento);
	            
	            // Captura e adição de itens de execução
	            boolean adicionarMaisItens = true;
	            while (adicionarMaisItens) {
	                System.out.println("Digite o percentual do item de execução:");
	                double percentual = scanner.nextDouble();
	                scanner.nextLine(); // Consumir o newline
	                
	                System.out.println("Digite a descrição do item de execução:");
	                String descricao = scanner.nextLine();
	                
	                System.out.println("Digite a data de execução (dd/MM/yyyy):");
	                Date dataExecucao = sdf.parse(scanner.nextLine());
	                
	                // Criação e adição do item
	                ItensExecucao item = new ItensExecucao(percentual, descricao, dataExecucao);
	                tarefa.adicionarItem(item);
	                
	                System.out.println("Deseja adicionar mais itens? (sim/não):");
	                String resposta = scanner.nextLine();
	                if (resposta.equalsIgnoreCase("não")) {
	                    adicionarMaisItens = false;
	                }
	            }
	            
	            // Exibindo as informações da tarefa
	            System.out.println("\n");
	            System.out.println("----------------------------------------------------------------");
	            System.out.println("\nInformações da Tarefa:");
	            System.out.println("Nome da Tarefa: " + tarefa.getNomeTarefa());
	            System.out.println("Detalhamento: " + tarefa.getDetalhamento());
	            System.out.println("Data Limite: " + sdf.format(tarefa.getDataLimiteExecucao()));
	            System.out.println("Percentual de Conclusão: " + tarefa.getPercentualConclusao() + "%");
	            System.out.println("-----------------------------------------------------------------");
	            
	            // Exibindo informações dos itens de execução
	            System.out.println("\nItens de Execução:");
	            for (ItensExecucao item : tarefa.getItensExecucao()) {
	                System.out.println("Item: " + item.getDescricao() + " - Percentual: " + item.getPercentual() + "% - Data de Execução: " + sdf.format(item.getDataExecucao()));
	            }
	        } catch (ParseException e) {
	            System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
	        } finally {
	            scanner.close();
	        }
	    }
}	
