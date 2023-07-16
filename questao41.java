import java.util.ArrayList;
import java.util.Scanner;

public class questao41 {
    public static int produto(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }

        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os numeros (digite 's' para parar): ");
        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        int resultado = produto(numeros);
        System.out.println("O produto dos numeros eh: " + resultado);
    }
}
