import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		// calcule e mostre a diferença do produto de A e B pelo produto de C e D
		// segundo a fórmula: DIFERENCA = (A * B - C * D).
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva os valores de 'a', 'b', 'c' e 'd'");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("Diferença = " + ((a*b)-(c*d)) );
		
		
	}

}
