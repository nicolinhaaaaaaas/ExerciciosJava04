
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

class EntradaEmAgenda2 {

    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Date data;
    private String hora;
    private String assunto;

    public EntradaEmAgenda2(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.data = new Date(ano - 1900, mes - 1, dia);
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataInstancia = sdf.format(data);
        String dataComparacao = String.format("%02d/%02d/%04d", dia, mes, ano);
        return dataInstancia.equals(dataComparacao);
    }

    public String toString() {
        String str = ("Data: " + formato.format(data) + "\n");
        str += ("Hora: " + hora + "\n");
        str += ("Assunto: " + assunto);

        return str;
    }
}

class Agenda2 {

    private ArrayList<EntradaEmAgenda2> Compromissos2 = new ArrayList<>();

    public void adicionarCompromisso(EntradaEmAgenda2 entrada) {
        Compromissos2.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataComparacao = String.format("%02d/%02d/%04d", dia, mes, ano);

        System.out.println("Compromissos no dia " + dataComparacao + ":");
        for (EntradaEmAgenda2 entrada : Compromissos2) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada.toString());
            }
        }
    }
}

public class questao38ver2 {

    public static void main(String[] args) {
        Agenda2 agenda = new Agenda2();
        Scanner scanner = new Scanner(System.in);

        while(true) {
        	menu();
        	int opcao = scanner.nextInt();
        	
        	switch(opcao) {
        	
        	case 1:
        		System.out.print("Digite a hora do compromisso: ");
        		String hora = scanner.next();
        		System.out.print("Digite o dia: ");
        		int dia = scanner.nextInt();
        		System.out.print("Digite o mes: ");
        		int mes = scanner.nextInt();
        		System.out.print("Digite o ano: ");
        		int ano = scanner.nextInt();
        		System.out.print("Digite o assunto: ");
        		String assunto = scanner.next();
        		
        		agenda.adicionarCompromisso(new EntradaEmAgenda2(hora, dia, mes, ano, assunto));
        		
        		System.out.println("Compromisso adicionado a agenda\n");
        		
        	break;
        	
        	case 2:
        		
        		System.out.println("Qual data deseja conferir?");
        		System.out.print("Digite o dia: ");
        		int diaConferir = scanner.nextInt();
        		System.out.print("Digite o mes: ");
        		int mesConferir = scanner.nextInt();
        		System.out.print("Digite o ano: ");
        		int anoConferir = scanner.nextInt();
        		
        		agenda.listaDia(diaConferir, mesConferir, anoConferir);
        	break;
        	
        	case 0:
        		System.out.println("Encerrando...");
        		return;
        		
        	default:
        		System.out.println("opcao invalida");
        	break;
        	}
        }

    }
    
    public static void menu() {
    	System.out.println("O que deseja fazer?");
    	System.out.println("(1)- Adicionar um novo compromisso");
    	System.out.println("(2)- Conferir data do compromisso");
    	System.out.println("(0)- Sair.\n");
    }
}
