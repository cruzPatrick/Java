import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		System.out.println("Qual o valor da largura do retangulo? ");
		r1.largura = sc.nextDouble();
		System.out.println("Qual o valor da altura? ");
		r1.altura = sc.nextDouble();
		
		System.out.println("Area = " + r1.Area());
		System.out.println("Perimetro = " + r1.Perimetro());
		System.out.println("Diagonal = " + r1.Diagonal());
		
		
		sc.close();
	}

}
