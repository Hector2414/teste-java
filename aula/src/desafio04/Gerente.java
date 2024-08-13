package desafio04;

public class Gerente extends Funcionario{
	
	private double bonus;

	public Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
		 
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
			return getSalario() + bonus;
	}

	@Override
	public void ExibirDetalhes() {
		// TODO Auto-generated method stub
		super.ExibirDetalhes();
		
		System.out.println("Bônus: " + bonus);
		System.out.println("Salario Tota: " + calcularSalario());
	}

	
}
