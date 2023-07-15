package questao43;

public class TestaEquipamento {
	
	public static void main(String[] args) {
	
		Equipamento equipamento = new Equipamento(0, 0);
		Computador computador = new Computador(0, 0, null, null);
		
		equipamento.setQuantidade(5);
		equipamento.setPreco(150);
		
		computador.setUsuario("Thiago");
		computador.setPerifericos("Mouse");
		computador.setQuantidade(5);
		computador.setPreco(173);
		
		System.out.println(equipamento.toString());
		System.out.println(computador.toString());
		
		System.out.println(computador.getPreco());
	}
	
}



package questao43;

public class Equipamento {
	
	public int quantidade;
	
	public float preco;
	
	public Equipamento(int quantidade, float preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
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
	
	public Computador(int quantidade, float preco, String usuario, String perifericos) {
		super(quantidade, preco);
		this.usuario = usuario;
		this.perifericos = perifericos;
	}
		
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
		return "o Usuario: "+ usuario + " comprou o periferico " + perifericos + super.toString();
				
	}

}

