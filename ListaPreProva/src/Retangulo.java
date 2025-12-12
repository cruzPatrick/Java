
public class Retangulo extends Forma {
	public double l1, l2;
	
	public Retangulo(double l1, double l2) {
		super();
		this.l1 = l1;
		this.l2 = l2;
	}
	
	@Override
	public void calcularArea() {
		super.calcularArea();
		System.out.println("A area é: " + (l1*l2));
	}
}
