package polimorf;

public class PagamentoCartao extends Pagamento{
	public Long numero;
	public Long cvc;
	public Long data;

	
	public PagamentoCartao() {
		super();
		this.numero = null;
		this.cvc = null;
		this.data = null;
	}
	public PagamentoCartao(long numero, long cvc, long data, double valor) {
		super(valor);
		this.numero = numero;
		this.cvc = cvc;
		this.data = data;
	}
	
	@Override
	public void pagar() {
		System.out.println("Pagamento em cartão");
	}
}
