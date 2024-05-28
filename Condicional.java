package aula02;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*if (20 < 18 ) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
		
		int time = 9;
		
		if (time < 12) {
			System.out.println("Bom dia");
		}else if(time <= 18){
			System.out.println("Boa Tarde");
		}else {
			System.out.println("Boa Noite");
		}
}
}