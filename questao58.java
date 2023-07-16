import java.util.*;

public class questao58 {
	static Scanner scanner = new Scanner(System.in);
	static String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", 
						"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	public static Integer numero;
	
	public static void main(String[] args) {
			
	while(true) {
		System.out.println("Digite um valor de 1 a 12");
		numero = scanner.nextInt();
		try {
			checarMes();
			//break;
		}
		catch(Exception e) {
				System.out.println("um prolema: "+ e);
			}
		}
	}
	
	static void checarMes() throws mesException {
		
		if(numero.equals(1)) {
			System.out.println(meses[0]);
		}
		else if(numero.equals(2)) {
			System.out.println(meses[1]);
		}
		else if(numero.equals(3)) {
			System.out.println(meses[2]);
		}
		else if(numero.equals(4)) {
			System.out.println(meses[3]);
		}
		else if(numero.equals(5)) {
			System.out.println(meses[4]);
		}
		else if(numero.equals(6)) {
			System.out.println(meses[5]);
		}
		else if(numero.equals(7)) {
			System.out.println(meses[6]);
		}
		else if(numero.equals(8)) {
			System.out.println(meses[7]);
		}
		else if(numero.equals(9)) {
			System.out.println(meses[8]);
		}
		else if(numero.equals(10)) {
			System.out.println(meses[9]);
		}
		else if(numero.equals(11)) {
			System.out.println(meses[10]);
		}
		else if(numero.equals(12)) {
			System.out.println(meses[11]);
		}
		else {
			throw new mesException("Valor invalido");
		}
	}
			
}
	
class mesException extends Exception{
		
	mesException(String message){
		super(message);
	}
}
