public class Main {

    public static void main(String[] args) {
        Cliente aluno = new Cliente();
        Curso curso = new Curso();

        aluno.nome = "Joaquim Vitor";
        aluno.email = "joaquimDaSilva@gmail.com";
        curso.nome = "Ciências da Computação";
        curso.turma = "Manhã";

        System.out.println(
            "O Aluno " +
                aluno.nome +
                " está cursando " +
                curso.nome +
                " e é da turma " +
                curso.turma +
                "\nEmail para contato: " +
                aluno.email
        );
    }
}
