package aula3POO;
import java.util.Scanner;

public class MochilaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Mochila [] mochilas = new Mochila[4];

		double media, soma = 0;
		
		for(int i = 0; i < mochilas.length; i++) {
			System.out.printf("Qual a cor? ");
			String cor = sc.nextLine();
			System.out.printf("Qual o ano de fabricação? ");
			int ano = sc.nextInt();
			mochilas[i] = new Mochila(cor, ano);
			
			soma+= mochilas[i].getAnoFabricacao();
		}

		media = soma/mochilas.length;
		
		System.out.println("A media dos anos das bolas é: " + media);
		
		sc.close();
	}

}
