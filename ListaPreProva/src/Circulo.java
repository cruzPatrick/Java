
public class Circulo extends Forma {
	public double r;
	
	public Circulo(double r) {
		super();
		this.r = r;
	}
	
	@Override
	public void calcularArea() {
		super.calcularArea();
		System.out.println("A area é: " + (3.14*(r*r)));
	}
}
