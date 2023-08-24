import java.util.LinkedList;

//Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um
//segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa.
//Não devem ser utilizados métodos da Java API para realizar a inversão


public class questao53 {

	public static void main(String[] args) {
		
		LinkedList<Character> lista1 = new LinkedList<>();
		
		lista1.add('A');
		lista1.add('B');
		lista1.add('C');
		lista1.add('D');
		lista1.add('E');
		lista1.add('F');
		lista1.add('G');
		lista1.add('H');
		lista1.add('I');
		lista1.add('J');
		
		LinkedList<Character> lista2 = listaInvertida(lista1);
		
		System.out.println("Lista original:  "+lista1);
		System.out.println("Lista invertida: "+lista2);

	}
	
	public static LinkedList<Character> listaInvertida(LinkedList<Character> lista1){
		LinkedList<Character> lista2 = new LinkedList<>();
		
		for(int i = lista1.size() - 1; i>= 0 ; i--) {
			lista2.add(lista1.get(i));
		}
		
		return lista2;
	}
	

}
