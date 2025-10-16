public class Conta {
	private int numconta;
	private String nome;
	private double val;
	
	public Conta (int numconta, String nome) {
		this.numconta = numconta;
		this.nome = nome;
	}
	
	public Conta (int numconta, String nome, double val) {
		this.nome = nome;
		this.numconta = numconta;
		this.val = val;
	}
	
	public int getNumConta() {
		return numconta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVal() {
		return val;
	}
	
	public void depos(double depo) {
		val += depo;
	}
	
	public void saque(double saque) {
		val -= (saque + 5);
	}
}
