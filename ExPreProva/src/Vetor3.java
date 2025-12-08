import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] quarto = new int[10];
		Arrays.fill(quarto, -1);
		
		System.out.println("Quantos quartos serão alugados: ");
		int qtdEstudante;
		do {
			qtdEstudante = sc.nextInt();
			if(qtdEstudante<1||qtdEstudante>10) 
				System.out.println("número invalido, escreva novamente: ");
		}while(qtdEstudante<1||qtdEstudante>10);
		
		Aluguel[] aluguel = new Aluguel[qtdEstudante];
		
		for(int i =0; i<qtdEstudante;i++) {
			sc.nextLine();
			aluguel[i] = new Aluguel();
			System.out.println("Aluguel #" + (i+1));
			aluguel[i].nome = sc.nextLine();
			aluguel[i].email = sc.nextLine();
			aluguel[i].quarto = sc.nextInt();
			
			quarto[aluguel[i].quarto] = i;
			
			
		}
		for(int q =0; q< 10; q++) {
			
			if(quarto[q] != -1) {
				int indice = quarto[q];
				System.out.println(q + ": " + aluguel[indice].nome + ", " + aluguel[indice].email);
			}
		}
		
	}

}
