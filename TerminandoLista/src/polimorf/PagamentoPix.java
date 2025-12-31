package polimorf;

public class PagamentoPix extends Pagamento{
	private int codigo;
	public PagamentoPix() {
		super();
		this.codigo = 0;
	}
	public PagamentoPix(double valor, int codigo) {
		super(valor);
		this.codigo = codigo;
	}
	
	@Override
	public void pagar() {
		System.out.println("Pagamento via pix");
	}
}
