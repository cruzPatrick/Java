package polimorf;

public class PagamentoBoleto extends Pagamento{
	public Long cpf;
	
	public PagamentoBoleto() {
		super();
		this.cpf = null;
	}
	
	public PagamentoBoleto(Double valor, Long cpf) {
		super(valor);
		this.cpf = cpf;
	}
	
	@Override
	public void pagar() {
		System.out.println("Pagamento em boleto");
	}
}
