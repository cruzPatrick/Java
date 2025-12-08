import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vetor3denovo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] quartos = new int[10];
		Arrays.fill(quartos, -1);
		
		int qtd;
		
		do {
			qtd = sc.nextInt();
			if(qtd<1 || qtd>10) 
				System.out.printf("Número não válido, favor inserir outro: ");
			
		}while(qtd<1 || qtd>10);
		
		Aluguel[] aluguel= new Aluguel[qtd]; 
		for(int i = 0; i < qtd; i ++) {
			sc.nextLine();
			aluguel[i] = new Aluguel();
			
			System.out.printf("Aluguel #%d", i+1);
			System.out.printf("\nNome: ");
			aluguel[i].nome = sc.nextLine();
			System.out.printf("Email: ");
			aluguel[i].email = sc.nextLine();
			System.out.printf("Quarto: ");
			int alu = sc.nextInt();
			
			while(alu < 0 || alu > 9) {
				System.out.printf("Favor colocar números entre 0-9: ");
				alu=sc.nextInt();
			}
			
			while(quartos[alu] != -1) {
				System.out.printf("O quarto já está ocupado, escolha outro: ");
				alu = sc.nextInt();
				
				while(alu <0 || alu>9) {
					System.out.printf("Favor colocar números entre 0-9: ");
					alu=sc.nextInt();
				}
				
			}
			
			
			aluguel[i].quarto = alu;
			quartos[aluguel[i].quarto] = i;
		}
		
		for(int j = 0; j<10; j++) {
			int indice = quartos[j];
			if(quartos[j] != -1) {
				System.out.println(j + ": " + aluguel[indice].nome + ", " + aluguel[indice].email);
			}
		}
		
	}

}
