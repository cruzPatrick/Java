package aula3POO;

public class UtilsMain {

	public static void main(String[] args) {
		System.out.println("a soma de 1 e 2 é: " + Utils.calculaMedia(1,2));
		
		System.out.println("A soma de 1, 2 e 3 é: " + Utils.calculaMedia(1, 2, 3));
		
		System.out.println("A soma de 1, 2, 3 e 4 é: " + Utils.calculaMedia(1, 2, 3, 4));
		
		Utils a = new Utils();
		
		System.out.println(a); // -> toString()

	}

}
