public class Conta {
	private int numeroConta;
	private String titular;
	private double valor;
	
	
	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public Conta(int numeroConta, String titular, double valor) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.valor = valor;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void saque(double saq) {
		valor -= saq + 5;
	}
	public void deposito(double depo) {
		valor += depo;
	}
}
