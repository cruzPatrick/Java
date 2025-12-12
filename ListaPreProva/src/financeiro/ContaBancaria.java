package financeiro;
public class ContaBancaria {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double v) {
		this.saldo += v;
	}
	
	public void sacar(double v) { //ideal seria fazer uma verificação. Está abaixo
		this.saldo -= v;
	}
	
	protected void mostrarSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
}
/*

public void sacar(double v){
	if(this.saldo >= v) //ou v<=this.saldo
		this.saldo-=v;
	else
		System.out.println("Você não tem esse saldo");
}


*/