//nao sei se ta tudo certo, mas seila

public class Funcionario {

	String nome;
	float salario;
	
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	public String getName() {
		return nome;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSalario() {
		return salario;
	}
	
	public void aumentarSalario() {
		System.out.println("Salario atual: R$ "+salario);
		salario = (float) (salario * 1.3);
		System.out.println("Novo salario: R$ "+salario);
	}
	
	public void ganhoAnual() {
		System.out.println("Ganho anual: R$ "+salario*12+ " e o 13º: R$ "+salario);
	}
	
	public String toString() {
		return "Nome: "+nome+ " ; Salario: R$ "+salario;
	}
}


public class Assistente extends Funcionario{

	public Assistente(String nome, float salario, int matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}

	int matricula;
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	
	public String toString() {
		return super.toString() + " ; numero de matricula: "+matricula;
	}
}


public class Tecnico extends Assistente{

	public Tecnico(String nome, float salario, int matricula, boolean dia, float bonus, int adicionalNoturno) {
		super(nome, salario, matricula);
		this.dia = dia;
		this.bonus = bonus;
		this.adicionalNoturno = adicionalNoturno;
	}
	boolean dia;
	float bonus;
	int adicionalNoturno;
	
	public void setDia() {
		dia = true;
	}
	public void setNoite() {
		dia = false;
	}
	
	public void salario() {
		salario = salario * bonus;
		if(dia == false) {
			salario += adicionalNoturno;
			System.out.println("Salario atual: R$ "+salario);
		}else {
			System.out.println("Salario atual: R$ "+salario);
		}
	}
	
	public float salario1() {
		salario = salario * bonus;
		return salario;
		
	}
	
	public void ganhoAnual() {
		salario = (salario*bonus)*12;
		System.out.println("Salario anual: R$ ");
	}
	
	public String toString() {
		return "Nome: "+super.nome + " ; matricula: " + super.matricula + " ; salario: "+salario1();  
	}
	
}


public class Administrativo extends Assistente{

	public Administrativo(String nome, float salario, int matricula, boolean dia, float bonus, int adicionalNoturno) {
		super(nome, salario, matricula);
		this.dia = dia;
		this.bonus = bonus;
		this.adicionalNoturno = adicionalNoturno;
	}
	boolean dia;
	float bonus;
	int adicionalNoturno;
	
	public void setDia() {
		dia = true;
	}
	public void setNoite() {
		dia = false;
	}
	
	public void salario() {
		salario = salario * bonus;
		if(dia == false) {
			salario += adicionalNoturno;
			System.out.println("Salario atual: R$ "+salario);
		}else {
			System.out.println("Salario atual: R$ "+salario);
		}
	}
	
	public float salario1() {
		salario = salario * bonus;
		return salario;
		
	}
	
	public void ganhoAnual() {
		salario = (salario*bonus)*12;
		System.out.println("Salario anual: R$ ");
	}
	
	public String toString() {
		return "Nome: "+super.nome + " ; matricula: " + super.matricula + " ; salario: "+salario1();  
	}
}


// esse main provavelmente ta errado, n tava funcionando

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario(null, 0);
		Assistente assistente01 = new Assistente(null, 0, 0);
		Tecnico tecnico01 = new Tecnico(null, 0, 0, false, 0, 0);
		Administrativo adm01 = new Administrativo(null, 0, 0, false, 0, 0);
		
		funcionario01.setName("Nicolas");
		funcionario01.setSalario(700);
		funcionario01.toString();
		funcionario01.ganhoAnual();
		funcionario01.aumentarSalario();
		
		System.out.println("");
		
		assistente01.setMatricula(712);
		assistente01.setName("Anabel");
		assistente01.setSalario(1000);
		assistente01.toString();
		
		System.out.println("");
		
		tecnico01.setName("Thiago");
		tecnico01.setSalario(500);
		tecnico01.getSalario();
		tecnico01.setDia();
		tecnico01.getSalario();
		tecnico01.ganhoAnual();
		tecnico01.toString();
		

	}

}
