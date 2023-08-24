import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class questao54 {

    public static void main(String[] args) {
        String texto = "HELLO THERE";

        Map<Character, Integer> contagemLetras = contarOcorrencias(texto);

        // Converter o mapa para TreeMap para exibir em ordem alfabética
        Map<Character, Integer> contagemOrdenada = new TreeMap<>(contagemLetras);

        for (Map.Entry<Character, Integer> entry : contagemOrdenada.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> contarOcorrencias(String texto) {
        Map<Character, Integer> contagemLetras = new HashMap<>();

        for (char letra : texto.toCharArray()) {
            if (Character.isLetter(letra)) {
                letra = Character.toUpperCase(letra); // Ignorar diferenças de caixa
                contagemLetras.put(letra, contagemLetras.getOrDefault(letra, 0) + 1);
            }
        }

        return contagemLetras;
    }
}
