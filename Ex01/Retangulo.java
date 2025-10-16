
public class Retangulo {
	double largura;
	double altura;
	
	public double Area() {
		return largura*altura;
	}
	public double Perimetro() {
		return (largura*2)+(altura*2);
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
}
