import java.util.Scanner;

public class PolimorfTets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal[] a  = new Animal[2];
		
		a[0] = new Gato();
		a[1] = new Cachorro();
		
		a[0].fazerSom();
		a[1].fazerSom();
		
		for(Animal animal: a) {
			animal.fazerSom();
		}
		sc.close();
	}

}
