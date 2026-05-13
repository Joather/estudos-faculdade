// ArrayDeque é mais rapido que o LinkedList pois usa um array internamento em vez de ponteiros encadeados

import java.util.ArrayDeque;
import java.util.Queue;

public class FilaPacienteArrayDeque {

    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();

        // Adicionando Pessoas na fila
        fila.offer("José");
        fila.offer("João");
        fila.offer("Maria");

        // Saida da fila até o momento
        System.out.println("Fila atual: " + fila);

        // Removendo o primeiro da fila
        String atendido = fila.poll();
        System.out.println("Atendido agora: " + atendido);
        System.out.println("Proximos da fila: " + fila);
    }
}
