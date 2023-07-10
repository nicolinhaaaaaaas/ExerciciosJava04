package questao38;
import java.util.*;

public class EntradaEmAgenda {
	Scanner scanner = new Scanner(System.in);
	
	private int dia, mes, ano;
	private String assunto, hora;
	
	EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto){
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.assunto = assunto;
		
	}
	
	public String toString() {
		return hora +"\t"+ dia+"/"+mes+"/"+ano+ "\t Assunto:" + assunto; 
	}
	
	public void ehNoDia() {
		if()
	}
	
	

}
