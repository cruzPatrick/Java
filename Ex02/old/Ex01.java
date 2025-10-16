import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o numero inteiro: ");
		int val = sc.nextInt();
		if(val>=0) {
			System.out.println("Não negativo");
		}
		else
			System.out.println("Negativo");
	}

}
