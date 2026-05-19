public class Matriz {

    public static void main(String[] args) {
        // Criando o Tabuleiro
        char[][] tabuleiro = {
            { 'O', 'O', 'X' },
            { 'O', 'X', 'O' },
            { 'X', 'O', 'O' },
        };

        // Fazendo os Loops (nunca fiz saporra na vida)
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
