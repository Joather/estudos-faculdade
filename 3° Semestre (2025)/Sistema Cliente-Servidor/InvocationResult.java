import java.util.HashMap;
import java.util.Map;

public class InvocationResult {
    public static void main (String[] args){
        HashMap<String, Integer> listaRestaurantes = new HashMap<>();
        listaRestaurantes.put("donnaPizza", 500);
        listaRestaurantes.put("cleitonSalgados", 350);
        listaRestaurantes.put("padariaJose", 750);
        int clienteEstaEm = 1000;
        double menorDistancia = Double.MAX_VALUE;
        String restauranteMaisProximo = "";

        for (Map.Entry<String, Integer> entry : listaRestaurantes.entrySet()) {
            String nome = entry.getKey();
            int distancia = entry.getValue();
            int resultado = clienteEstaEm - distancia;
            if (resultado < menorDistancia) {
            menorDistancia = resultado;
            restauranteMaisProximo = nome;}
        }
        System.out.println("O restaurante mais proximo é o " + restauranteMaisProximo + " e ele está a " + (int)menorDistancia + " Metros");
    }
}
