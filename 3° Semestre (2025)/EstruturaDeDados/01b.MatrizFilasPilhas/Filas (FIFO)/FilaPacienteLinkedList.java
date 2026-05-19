import java.util.LinkedList;
import java.util.Queue;

public class FilaPacienteLinkedList {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando pessoas na fila
        fila.offer("José");
        fila.offer("João");
        fila.offer("Maria");

        // Saida da fila até o momento
        System.out.println("Fila atual: " + fila);

        // peek() para mostrar quem será atendido
        System.out.println("Próximo: " + fila.peek());

        // Removendo o Primeiro da fila
        String atendido = fila.poll();
        System.out.println("Atendido: " + atendido);
        System.out.println("Restante na fila: " + fila);
    }
}
