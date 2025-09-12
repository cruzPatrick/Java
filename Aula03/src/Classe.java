import java.util.Scanner;


public class Classe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Qual a sua idade: ");
		int idade = sc.nextInt();
		
		Pessoa p1 = new Pessoa(nome, idade);
		
		p1.apresentar();
		
		sc.close();
		
		
	}

}
