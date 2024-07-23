package desafio01;

import java.util.Random;

public class Conta {
	
	private String nome;
	private double saldo;
	private int conta;
	private int saques;
	
	
	
	
	
	public Conta(String nome, double saldoInicial) {
		
		this.nome = nome;
		this.saldo = saldoInicial;
		Random numero = new Random();
		this.conta = 1 + numero.nextInt(999); // Criando o número da conta
		this.saques = 0;
	}
	
	public void extrato() {
		System.out.println("Nome: " + nome);
		System.out.println("Número da conta: " + conta);
		System.out.println("Saldo : R$ " + saldo);
		System.out.println("Saques realizados hoje: " + saques);
	}
	
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("O valor do saque deve ser um número inteiro");
			}
		if(valor > saldo) {
			System.out.println("saldo insuficiente para realizar o saque");
			return;
		}
		
		int valorInicial = (int) valor;
		saldo -= valor;
		
		saques ++;
		
		int notas100 = valorInicial / 100;
		valorInicial %= 100;
		
		int notas50 = valorInicial / 50;
		valorInicial %= 50;
		
		int notas20 = valorInicial / 20;
		valorInicial %= 20;
		
		int notas10 = valorInicial / 10;
		valorInicial %= 10;
		
		int notas5 = valorInicial / 5;
		valorInicial %= 5;
		
		int notas2 = valorInicial / 2;
		valorInicial %= 2;
		
		System.out.println("O valor do saque: " + valor);
		System.out.println("Notas de 100: " + notas100);
		System.out.println("Notas de 50: " + notas50);
		System.out.println("Notas de 20: " + notas20);
		System.out.println("Notas de 10: " + notas10);
		System.out.println("Notas de 5: " + notas5);
		System.out.println("Notas de 2: " + notas2);
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado com sucesso");
		}else {
			System.out.println("Valor inválido para po depósito");
		}
	}
	
	//criação de GET e SET pressionar  ALT + SHIFT + S
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSaques() {
		return saques;
	}
	public void setSaques(int saques) {
		this.saques = saques;
	}
	
	
}
