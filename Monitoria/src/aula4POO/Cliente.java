package aula4POO;

public class Cliente {
	private String cpf;
	private String nome;
	private String profissao;
	
	public Cliente() {
		
	}
	public Cliente(String cpf) {
		setCpf(cpf);
	}
	public Cliente(String cpf, String nome) {
		setCpf(cpf);
		setNome(nome);
	}
	public Cliente(String cpf, String nome, String profissao) {
		setNome(nome);
		setCpf(cpf);
		setProfissao(profissao);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public int soma(int x, int y) {
		return x + y;
	}
	public double soma(double x, double y) {
		return x+y;
	}
	public long soma(long x, long y) {
		return x + y;
	}
	
	@Override
	public String toString() {
		return "[nome: "+ getNome() +"] --- [cpf: " + getCpf() + "]";
	}
}
