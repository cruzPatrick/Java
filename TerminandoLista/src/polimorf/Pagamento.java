package polimorf;

public class Pagamento {
	public Double valor;
	
	public Pagamento() {
		this.valor = null;
	}
	public Pagamento(double valor) {
		this.valor = valor;
	}
	
	public void pagar() {
		System.out.println("Pagamento generico");
	}
}
