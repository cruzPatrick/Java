import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		// valor da área deste círculo com quatro casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do circulo");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio*raio);
		System.out.println("A = " + area);
	}

}
