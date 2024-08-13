package desafio04;

public class Desenvolvedor extends Funcionario{

	private int horaExtra;
	private double valorHoraExtra;
	
	
	public Desenvolvedor(String nome, double salario, int horaExtra, double valorHoraExtra) {
		super(nome, salario);
		
		this.horaExtra = horaExtra;
		this.valorHoraExtra = valorHoraExtra;
		
		
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario() + (horaExtra * valorHoraExtra);
	}

	@Override
	public void ExibirDetalhes() {
		// TODO Auto-generated method stub
		super.ExibirDetalhes();
		
		System.out.println("Hora Extra: " + horaExtra);
		System.out.println("Valor da Hora Extra: " + valorHoraExtra);
		System.out.println("Salario Total: " + getSalario());
	}

	
	
}
