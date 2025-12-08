import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Fale a quantidade de alturas para ler: ");
		int num = sc.nextInt();
		double[] vetor = new double[num];
		double altura = 0;
		for(int i = 0 ; i < num ; i++) {
			vetor[i] = sc.nextDouble();
			altura += vetor[i]; 
		}
		altura /= 3;
		System.out.println("A altura media é: " + altura);
		
		sc.close();
	}

}
