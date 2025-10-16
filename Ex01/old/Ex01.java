import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e
		// depois mostrar na tela a soma desses números com uma mensagem explicativa,
		// conforme exemplos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores inteiros");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		System.out.println("A soma de "+v1 + " e " + v2 + " é: " + (v1+v2));
		
	}

}
