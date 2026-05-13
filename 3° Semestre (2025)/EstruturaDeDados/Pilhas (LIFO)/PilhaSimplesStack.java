import java.util.Stack;

public class PilhaSimplesStack {

    public static void main(String[] args) {
        // Gerando o onjeto da pilha
        var pilhaDePratos = new Stack<>();

        // Adicionando elementos a pilha
        pilhaDePratos.push("Prato 2");
        pilhaDePratos.push("Prato 1");
        pilhaDePratos.push("Prato 3");

        // Imprimindo o topo da pilha com o metodo .peek()
        System.out.println(pilhaDePratos.peek());
    }
}
