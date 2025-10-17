import java.util.Scanner;
public class Condicional {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		soma = 0;
		System.out.println("Digite um valor qualquer: ");
		int val = sc.nextInt();
		for(int i = 0; i<val; i++) {
			x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		sc.close();
	}
}
