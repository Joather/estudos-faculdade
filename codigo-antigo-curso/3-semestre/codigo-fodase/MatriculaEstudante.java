public class MatriculaEstudante {

    public static void main(String[] args) {
        // nome delas: nomeAluno, idAluno, idadeAluno, taxaMatricula, notaAluno
        String nomeAluno = "João Da Silva";
        int idAluno = 67;
        int idadeAluno = 19;
        float taxaMatricula = 250.50f;
        char notaAluno = 'B';
        boolean matriculado = true;

        // Imprimindo na tela
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Número de Matricula: " + idAluno);
        System.out.println("Idade do Aluno: " + idadeAluno);
        System.out.println("Taxa de Matricula: " + taxaMatricula);
        System.out.println("Nota do Aluno: " + notaAluno);

        if (matriculado) {
            System.out.println("Este aluno está matriculado em nossa escola");
        }   else {
            System.out.println("Este aluno não está matriculado em nossa escola");
            }
    }
}
