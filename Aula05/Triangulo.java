//Patrick Cruz
public class Triangulo {
	public double lado1;
	public double lado2;
	public double lado3;
	//fazer metodo para calcular a area aqui dentro
	
	public double area() {
		double p = (lado1 + lado2 + lado3) / 2.0;
		double area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
		return area;
	}
	
}
