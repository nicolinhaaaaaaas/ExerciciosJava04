public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		
		circulo.desenha();
		System.out.println("");
		quadrado.desenha();
		System.out.println("");
		triangulo.desenha();

	}

}


public abstract class FiguraGeometrica {

	public abstract void desenha();
}

public class Circulo extends FiguraGeometrica{

	@Override
	public void desenha() {
		System.out.println("Voce desenhou um circulo o");
		System.out.println("Imagine aqui um circulo");
		
	}

}

public class Quadrado extends FiguraGeometrica{

	@Override
	public void desenha() {
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |____|");
		
	}

}


public class Triangulo extends FiguraGeometrica{

	@Override
	public void desenha() {
		System.out.println("______");
		System.out.println("Imagine aqui um triuangolo");
		
	}

}
