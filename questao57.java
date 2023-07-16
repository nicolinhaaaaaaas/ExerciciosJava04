import java.util.*;

public class questao57 {
	static Scanner scanner = new Scanner(System.in);
	static int valor1;
	static int valor2;
	
	public static void main(String[] args) {
		
		obterIntValido();
		
	}
	
	static void obterIntValido() {
		while(true) {
			try{
				System.out.print("Digite o primeiro valor: ");
				valor1 = Integer.parseInt(scanner.next());
				System.out.print("Digite o segundo valor: ");
				valor2 = Integer.parseInt(scanner.next());
			
				break;
				
			}
			catch(NumberFormatException e) {
				System.out.println("Valor invalido");
			}
			
		}
		int resultado = valor1 + valor2;
		System.out.println(resultado);
	}

}
