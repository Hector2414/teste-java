package desafio04;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionarios {

	private ArrayList<Funcionario>funcionarios;
	private Scanner scanner;
	
	
	public GestaoFuncionarios() {
		funcionarios = new ArrayList<>();
		scanner = new Scanner(System.in);

	}
	
	public void iniciar() {
		int opcao;
		
		do {
			System.out.println("\nMenu");
			System.out.println("1- Adicionar Gerente");
			System.out.println("2- Adicionar Desenvolvedor");
			System.out.println("3- Visualizar Detalhe");
			System.out.println("4- Calcular Salário");
			System.out.println("5- Sair");
			System.out.println("Escolha uma opção:");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				adicionarGerente();
				break;
			
			
			case 2:
				adicionarDesenvolvedor();
				break;
			
		
			case 3:
				VisualizarDetalhesFuncionarios();
				break;
			
			
			case 4:
				System.out.println("calculado salario");
				break;
	
			case 5:
				System.out.println("Saindo ...");
				break;
				default: System.out.println("Opção invalida tente novamente");
			}
			
			
			
		} while (opcao != 5);
		
		
		
	}private void adicionarGerente() {
			System.out.println("Digite o nome de um Gerente: ");
			String nome = scanner.nextLine();
			System.out.println("Digite o salário do gerente: ");
			double salario = scanner.nextDouble();
			System.out.println("Digite o bonus do Gerente: ");
			double bonus = scanner.nextDouble();
			scanner.nextLine();
			
			Gerente gerente = new Gerente(nome, salario, bonus);
			funcionarios.add(gerente);
			System.out.println("gerente adicionado com sucesso!");
			
			
			
		}
	
	private void VisualizarDetalhesFuncionarios(){
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrasdo ");
			return;
		}
		for(Funcionario funcionario : funcionarios) {
			funcionario.ExibirDetalhes();
			System.out.println("--------------------------------");
		}
	}
	
	private void adicionarDesenvolvedor() {
		
		System.out.println("Digite o nome de um Desenvolvedor: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o salário do Desenvolvedor: ");
		double salario = scanner.nextDouble();
		System.out.println("Digite as horas extras do desenvolvedor: ");
		int horasExtras = scanner.nextInt();
		System.out.println("Digite o valor da hora extra: ");
		double valorHoraExtra = scanner.nextDouble();
		 
		Desenvolvedor desenvolvedor = new Desenvolvedor(nome, salario, horasExtras, valorHoraExtra); 
			funcionarios.add(desenvolvedor);
			
		
	
}
	
	private void calcularSalario() {
		
		if(funcionarios.isEmpty()) {
		
			System.out.println("Nenhum funcionario cadastrado");
			return;
		}
		
		for (Funcionario funcionario: funcionarios) {
			
			System.out.println("O salario do funcionário: " + funcionario.getNome() + funcionario.calcularSalario());
		}
	}
	
	
	
		
}
