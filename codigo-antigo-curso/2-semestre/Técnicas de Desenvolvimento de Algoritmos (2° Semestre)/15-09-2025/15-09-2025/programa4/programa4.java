package programa4;

import java.util.Scanner;

public class programa4 {
    public static void main(String[] args) {
        double altura =8;
        double peso =0;
        String sex="";
        Scanner sc = new Scanner(System.in);
    // Recebendo gênero (Masculino ou Feminino)
        System.out.printf("Informa o Sexo (M) OU (F): ");
        sex = sc.nextLine();
        System.out.printf("Informe a estatura (EM METROS): ");
        altura = sc.nextDouble();

// Verifica gênero e calcula o peso ideal
if (sex == "M"){
    peso = (72.7 * altura);
}
else
{
    if (sex == "F"){
        peso = (62.1 * altura)-44.7;
    }
    else
    {
        System.out.println("Opção inválida "+ sex);
    }
}
// Exibe o Resultado
    System.out.println("peso ideal= " + peso);

        }
}
