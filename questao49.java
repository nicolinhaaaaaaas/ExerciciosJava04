public class Funcionario {

	float salario = 2;
	int numero;
	String nome;
	String setor;
	
	Funcionario(String nome, String setor, int numero){
		this.nome = nome;
		this.setor = setor;
		this.numero = numero;
	}
	
	Funcionario(String nome, float salario, String setor, int numero){
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
		this.numero = numero;
	}
	
	void identificacao() {
		System.out.println("Nome: "+nome);
		System.out.println("Numero: "+numero);
		System.out.println("Setor: "+setor);
		System.out.println("Salario: "+salario+ " /hr");
	}
	
	void aumento() {
		salario++;
		System.out.println("Salario pos aumento: "+salario+ " /hr");
	}
	
	void folga() {
		System.out.println("O funcionario: "+nome+" nao trabalhara esse sabado.");
	}
}


class teste{
	public static void main(String[] args) {
		//isso é o primeiro construtor, com apenas o nome, setor e numero
		Funcionario funcionario01 = new Funcionario("Nicolas", "Lavoura", 112); 
		
		//isso é o segundo construtor, com nome, salario, setor e numero
		Funcionario funcionario02 = new Funcionario("Guilherme", 2, "Construcao", 115);
		
		//isso é polimorfismo, nomes iguais, construtores diferentes que podem receber coisas diferentes.
		
		funcionario01.identificacao();
		System.out.println("");
		funcionario02.identificacao();
		
		funcionario01.aumento();
		System.out.println("");
		funcionario02.folga();
		
	}
}
