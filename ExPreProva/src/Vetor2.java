import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva a quantidade: ");
		int num = sc.nextInt();
		
		Prod[] prod = new Prod[num];
		double menor = Double.MAX_VALUE, media = 0;
		
		
		for(int i = 0; i<num; i++) {
			prod[i] = new Prod();
			System.out.println("Escreva o valor");
			double val = sc.nextDouble();
			sc.nextLine();
			System.out.println("Escreva o nome: ");
			String nome = sc.nextLine();
			
			prod[i].setPreco(val);
			prod[i].setNome(nome);
			
			if(i==0) {
				menor = val;
			}
			
			if(val < menor) {
				menor = val;
			}
			
			media += prod[i].getPreco();
		}
		media /= num;
		System.out.println("A media é: " + media + " e o menor valor é: " + menor);
	}

}
