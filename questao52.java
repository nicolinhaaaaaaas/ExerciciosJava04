//MAIN

import java.util.ArrayList;
import java.util.Scanner;
public class DemoLivroDeBiblioteca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		LivroDeBiblioteca livro01 = new LivroDeBiblioteca("Harry Potter", "J.K. Rowling", 450, 2010, "Brasil");
		
		System.out.println(livro01.descricao());
		System.out.println(livro01.getTitulo());
		System.out.println(livro01.localizacao());
		System.out.println(livro01.toString());
		
		livro01.empresta();
		
		System.out.println(livro01.estaEmprestado());
		
		livro01.devolve();
		
		System.out.println(livro01.estaEmprestado());
		
		
	}

}

//INTERFACE

public interface ItemDeBiblioteca {

	int maximoDeDiasParaEmprestimo = 14;
	
	boolean estaEmprestado();
	
	void empresta();
	
	void devolve();
	
	String localizacao();
	
	String descricao();
	
	
}

//LIVRO

public class Livro {

	private String titulo;
	private String autor;
	private int numeroDePaginas;
	private int anoDaEdicao;
	
	Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao){
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
		this.anoDaEdicao = anoDaEdicao;
	}
	
	//nao precisava desses get e set
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumero(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	public void setAno(int anoDaEdicao) {
		this.anoDaEdicao = anoDaEdicao;
	}
	public String getTitulo() { //isso serve como o qualTitulo que a questao pedia
		return titulo;
	}
	public String getAutor() { // e isso como o qualAutor
		return autor;
	}
	public int getNumero() {
		return numeroDePaginas;
	}
	public int getAno() {
		return anoDaEdicao;
	}
	
	
	public String toString() {
		return "Titulo: "+titulo+ " \t Autor: "+autor+ " \t nmr de Paginas: "+numeroDePaginas+ " \t Ano de edicao: "+anoDaEdicao;
	}
}

//LIVRO DE BIBLIOTECA

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{

	private boolean emprestado;
	private String localizacao;

	LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao) {
		super(titulo, autor, numeroDePaginas, anoDaEdicao);
		this.localizacao = localizacao;
	}

	@Override
	public boolean estaEmprestado() {
		return emprestado;
	}

	@Override
	public void empresta() {
		emprestado = true;
		
	}

	@Override
	public void devolve() {
		emprestado = false;
		
	}

	@Override
	public String localizacao() {
		return localizacao;
	}

	@Override
	public String descricao() {
		return "Livro: " + getTitulo() + " - " + getAutor();
	}
	
	public String toString() {
		return super.toString() + ", emprestado = "+emprestado + ", localizacao = "+localizacao + '\'';
	}
}
