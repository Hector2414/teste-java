package desafio04;


public abstract class Funcionario {

	private String nome;
	private double salario;
	
	public  abstract double calcularSalario();
	
	public void ExibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salario);
	}
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	
}
