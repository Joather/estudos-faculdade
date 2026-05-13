import java.util.ArrayDeque;
import java.util.Deque;

public class MenuJogoArrayDeque {

    public static void main(String[] args) {
        // Criando a pilha do menu
        Deque<String> menuHistorico = new ArrayDeque<>();

        // Criando "Menu Principal"
        System.out.println("// ----------------- //");
        menuHistorico.push("Menu Principal"); // O Começo da pilha
        System.out.println(menuHistorico.peek()); // Mostrar Menu Principal
        System.out.println("// ----------------- //");

        // 4 Botões: Novo Jogo, Continuar, Opções, Cŕeditos

        // Indo para: Novo Jogo
        System.out.println(menuHistorico.peek());
        menuHistorico.push(" --> Novo Jogo");
        System.out.println("Menu Principal" + menuHistorico.peek());
        menuHistorico.push(" --> Save 1.");
        System.out.println(
            "Menu Principal --> Novo Jogo" + menuHistorico.peek()
        );
        // Voltando ao: Menu Principal
        menuHistorico.pop();
        System.out.println("Menu Principal" + menuHistorico.peek());
        menuHistorico.pop();
        System.out.println(menuHistorico.peek());

        // Linha para separar
        System.out.println("// ----------------- //");

        // Indo para: Continuar
        System.out.println(menuHistorico.peek());
        menuHistorico.push(" --> Continuar");
        System.out.println("Menu Principal" + menuHistorico.peek());
        menuHistorico.push(" --> Missão 3.");
        System.out.println(
            "Menu Principal --> Continuar" + menuHistorico.peek()
        );
        // Voltando ao: Menu Principal
        menuHistorico.pop();
        System.out.println("Menu Principal" + menuHistorico.peek());
        menuHistorico.pop();
        System.out.println(menuHistorico.peek());

        // Linha para separar
        System.out.println("// ----------------- //");

        // Indo para: Opções
        System.out.println(menuHistorico.peek());
        menuHistorico.push(" --> Opções");
        System.out.println("Menu Principal" + menuHistorico.peek());
        menuHistorico.push(" --> Sons");
        System.out.println("Menu Principal --> Opções" + menuHistorico.peek());
        // Voltando ao: Menu Principal
        menuHistorico.pop();
        System.out.println("Menu Principal" + menuHistorico.peek());
        menuHistorico.pop();
        System.out.println(menuHistorico.peek());

        // Linha para separar
        System.out.println("// ----------------- //");

        // Indo para: Créditos
        System.out.println(menuHistorico.peek());
        menuHistorico.push(" --> Créditos:");
        System.out.println("Menu Principal" + menuHistorico.peek());
        System.out.println(
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
        );
        // Voltando ao: Menu Principal
        menuHistorico.pop();
        System.out.println(menuHistorico.peek());

        // Linha para separar
        System.out.println("// ----------------- //");
    }
}
