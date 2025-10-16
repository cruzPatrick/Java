//Patrick Cruz
import java.util.Locale; // Importa a classe Locale para definir o padrão de localização
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Main {
	public static void main(String[] args) {
		// Define o padrão de localização para US (ponto decimal ao invés de vírgula)
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		//daria pra ser Triangulo t1, t2 = new Triangulo();

		
		System.out.println("Digite as medidas do triangulo X (ex: 3.22):");
		t1.lado1= sc.nextDouble();
		t1.lado2 = sc.nextDouble();
		t1.lado3 = sc.nextDouble();

		
		System.out.println("Digite as medidas do triangulo Y (ex: 5.24):");
		t2.lado1 = sc.nextDouble();
		t2.lado2 = sc.nextDouble();
		t2.lado3 = sc.nextDouble();

		
		
		if(t1.area() > t2.area()) {
			System.out.println("TrianguloX é maior que triangulo Y");
			System.out.format("\nO valor da área do triangulo X é %.2f", t1.area());
			System.out.format("\nO valor da área do triangulo Y é %.2f ", t2.area());
			sc.close();
			return;
		}
		if(t1.area() < t2.area()) {
			System.out.println("TrianguloY é maior que o trianguloX");
		}
		else {
			System.out.println("Ambos são iguais");
		}
		
		
		System.out.format("\nO valor da área do triangulo X é %.2f", t1.area());
		System.out.format("\nO valor da área do triangulo Y é %.2f ", t2.area());


		sc.close();
	}
}
