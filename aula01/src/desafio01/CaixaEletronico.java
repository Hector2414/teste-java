package desafio01;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o valor inicial na conta: ");
		double saldoInicial = scanner.nextDouble();
		
		Conta minhaConta = new Conta(nome, saldoInicial);
		
		int opcao;
		
		do {
			System.out.println("\nMenu");
			System.out.println("1-Extrato");
			System.out.println("2-Sacar");
			System.out.println("3-Depositar");
			System.out.println("4-Sair");
			System.out.println("Escolho uma opção: ");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:minhaConta.extrato();
			break;
			case 2:System.out.println("Digite um valor a sacar: ");
			double valorSaque = scanner.nextDouble();
			minhaConta.sacar(valorSaque);
			break;
			case 3:System.out.println("Digite o valor do depósito: ");
			double valorDeposito = scanner.nextDouble();
			minhaConta.depositar(valorDeposito);
			break;
			case 4:System.out.println("Obrigado por utilizaro caixa eletronico");
			break;
			
			default:System.out.println("Opção inválida, tente novamente");
			}
			
			
		} while (opcao != 4);

	}

}
