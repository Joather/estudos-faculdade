import java.util.Scanner;

public class funcaoDuasEntradas {
	public static int calcularPesoPotencia(int pesoCarro, int potenciaHP) {
		return (int) Math.pow(pesoCarro, 2) + (3 * potenciaHP) - 10;
	}

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o peso do carro?:");
		int pesoCarro = scanner.nextInt();

		System.out.print("Qual a potência do carro em HP?:");
		int potenciaHP = scanner.nextInt();

		int resultado = calcularPesoPotencia(pesoCarro, potenciaHP);
		System.out.println(pesoCarro + " " + potenciaHP + " " + resultado);

		scanner.close();
	}
}
