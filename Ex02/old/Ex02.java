import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o numero inteiro: ");
		int val = sc.nextInt();
		if(val%2 == 0) {
			System.out.println("Par");
		}
		else
			System.out.println("Impar");
	}

}
