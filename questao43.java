package questao43;

public class TestaEquipamento {
	
	public static void main(String[] args) {
	
		Equipamento equipamento = new Equipamento();
		Computador computador = new Computador();
		
		equipamento.setQuantidade(5);
		equipamento.setPreco(150);
		
		computador.setUsuario("Thiago");
		computador.setPerifericos("Mouse");
		
		System.out.println(equipamento.toString());
		System.out.println(computador.toString());
		
		System.out.println(equipamento.getPreco());
	}
	
}



package questao43;

public class Equipamento {
	
	private int quantidade;
	
	private float preco;
	
	public void setQuantidade(int novoQuantidade) {
		quantidade = novoQuantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(float novoPreco) {
		preco = novoPreco;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public String toString() {
		return "Quantidade: "+ quantidade + " e preco: " + preco;
	}

}



package questao43;

public class Computador extends Equipamento{
	
	private String usuario;
	
	private String perifericos;
		
	public void setUsuario(String novoUsuario) {
		usuario = novoUsuario;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setPerifericos(String novoPeriferico) {
		perifericos = novoPeriferico;
	}
	
	public String getPerifericos() {
		return perifericos;
	}
	
	public String toString() {
		return "o Usuario: "+ usuario + " comprou o periferico " + perifericos +
				"Quantidade: "+super.getQuantidade() + " e preco: " + super.getPreco();
	}

}

