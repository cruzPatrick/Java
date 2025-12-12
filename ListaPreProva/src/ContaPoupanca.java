import financeiro.ContaBancaria;
public class ContaPoupanca extends ContaBancaria{

	public ContaPoupanca() {
		super();
	}
	
	@Override
	protected void mostrarSaldo() {
		System.out.println("Saldo: " + this.getSaldo());
	}
	//pelo que exercício pede, seria só:
	
	public void emitirSaldoPoupanca() {
		mostrarSaldo();
	}
}
