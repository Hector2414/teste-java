package aula02;

public class DescontoSalarial {

	public static void main(String[] args) {
		
		int salario = 2500;
		double descontoIR;
		double descontoInss;
		double descontoFgts;
		double somaDescontos;
		double restanteSalario;
		
		
		
	
		
		descontoIR = salario * 0.1 ;
		descontoInss = salario * 0.1;
		descontoFgts = salario * 0.11; 
		
		somaDescontos = descontoFgts + descontoInss + descontoIR;
		restanteSalario = salario - somaDescontos;
		
	
		
		if (salario <= 900 ) {
			System.out.println("sem desconto");
		} else if (salario <= 1500) {
			 
			System.out.println("Salário Bruto:  (5 * 300)" +": "+ salario);
			System.out.println("Desconto Imposto de renda: " + descontoIR);
			System.out.println("Desconto INSS: " + descontoInss);
			System.out.println("Desconto FGTS: " + descontoFgts);
			System.out.println("Total de Descontos: " + somaDescontos);
			System.out.println("Salário Líquido: " + restanteSalario);
		} else if(salario >= 2500){
			
			System.out.println("Salário Bruto:  (5 * 500)" +": "+ salario);
			System.out.println("Desconto Imposto de renda: " + descontoIR);
			System.out.println("Desconto INSS: " + descontoInss);
			System.out.println("Desconto FGTS: " + descontoFgts);
			System.out.println("Total de Descontos: " + somaDescontos);
			System.out.println("Salário Líquido: " + restanteSalario);
			
		}

	}

}
